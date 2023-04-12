import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int divider = scanner.nextInt();

        int i = 0;

        for (int j = first; j <= second; j++){
            if (j % divider == 0){
                i++;
            }
        }

        System.out.println(i);
    }
}