import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int min = 1000;
var newVariable_0 = S.length();        for (int i = 0; i < newVariable_0 - 2; i++) {
var newVariable_1 = S.substring(i, i + 3);            int X = Integer.parseInt(newVariable_1);
var newVariable_2 = Math.abs(X - 753);            min = Math.min(min, newVariable_2);
        }
        System.out.println(min);
        sc.close();
    }
}