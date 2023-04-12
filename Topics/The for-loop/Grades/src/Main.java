import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        List<String> gradeList = new ArrayList<>();

        while (scanner.hasNext()){
            gradeList.add(scanner.next());
        }

        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;

        gradeList.remove(0);
        for (String s : gradeList) {
            switch (s) {
                case "A" -> a++;
                case "B" -> b++;
                case "C" -> c++;
                case "D" -> d++;
            }
        }

        System.out.println(d+" "+c+" "+b+" "+a);
    }
}