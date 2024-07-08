import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

var newVariable_0 = sc.next();        int a = Integer.parseInt(newVariable_0);
var newVariable_1 = sc.next();        int b = Integer.parseInt(newVariable_1);

        System.out.println((b % a == 0) ? a + b : b - a);
    }
}
