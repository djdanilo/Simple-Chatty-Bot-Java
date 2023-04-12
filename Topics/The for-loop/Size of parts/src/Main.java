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
        int larger = 0;
        int smaller = 0;
        int perfect = 0;

        for (int i = 0; i < numberList.size(); i++){
            if (numberList.get(i) < 0){
                smaller++;
            }
            else if (numberList.get(i) > 0){
                larger++;
            }
            else {
                perfect++;
            }
        }
        System.out.println(perfect+" "+larger+" "+smaller);
    }
}