import java.util.Arrays;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        int marbles = 0;
var newVariable_0 = a.length();        for (int i = 0; i < newVariable_0; i++) {
var newVariable_1 = a.charAt(i);            if (newVariable_1 == '1')marbles++;
        }
        System.out.println(marbles);
    }
}
