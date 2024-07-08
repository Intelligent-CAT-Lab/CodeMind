import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
var newVariable_0 = sc.nextInt();var newVariable_1 = sc.nextInt();        int a = newVariable_1 * newVariable_1;
var newVariable_2 = sc.nextInt();var newVariable_3 = sc.nextInt();        int b = newVariable_3 * newVariable_3;
        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}