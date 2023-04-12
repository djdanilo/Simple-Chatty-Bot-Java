import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        List<Integer> numberList = new ArrayList<>();

        while (scanner.hasNext()){
            numberList.add(scanner.nextInt());
        }
        numberList.remove(0);
        int sum = 0;

        for (int i = 0; i < numberList.size(); i++){
            if (numberList.get(i) % 6 == 0){
                sum += numberList.get(i);
            }
        }

        System.out.println(sum);
    }
}