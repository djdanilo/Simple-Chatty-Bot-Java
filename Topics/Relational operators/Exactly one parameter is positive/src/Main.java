import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();
        int thirdNum = scanner.nextInt();

        if (firstNum > 0 && secondNum > 0 && thirdNum > 0)
            System.out.println(false);
        else if(firstNum > 0 && secondNum <= 0 && thirdNum <= 0)
            System.out.println(true);
        else if(firstNum <= 0 && secondNum <= 0 && thirdNum > 0)
            System.out.println(true);
        else if(firstNum <= 0 && secondNum > 0 && thirdNum <= 0)
            System.out.println(true);
        else
            System.out.println(false);
    }
}