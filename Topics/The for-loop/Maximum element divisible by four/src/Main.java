import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        List<Integer> numbersList = new ArrayList<>();

        while (scanner.hasNext()){
            numbersList.add(scanner.nextInt());
        }
        numbersList.remove(0);
        Collections.sort(numbersList);
        Collections.reverse(numbersList);

        for (int i = 0; i < numbersList.size(); i++){
            if (numbersList.get(i) % 4 == 0) {
                System.out.println(numbersList.get(i));
                break;
            }
        }
    }
}