import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String inputText = scanner.next();
        char[] charsInputText = new char[inputText.length()];

        for (int i = 0; i < charsInputText.length; i++){
            if (inputText.charAt(i) == 'a')
                charsInputText[i] = 'b';
            else
                charsInputText [i] = inputText.charAt(i);

            System.out.print(charsInputText[i]);
        }
    }
}