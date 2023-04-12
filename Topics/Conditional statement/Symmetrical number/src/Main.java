import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int number = scanner.nextInt();
        StringBuilder sb = new StringBuilder();
        sb.append(number);
        if (sb.reverse().toString().equals(String.valueOf(number))){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}