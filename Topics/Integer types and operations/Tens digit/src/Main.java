import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int N = scanner.nextInt();
        StringBuilder sb = new StringBuilder();
        sb.append(N / 10);

        System.out.println(sb.reverse().toString().charAt(0));
    }
}