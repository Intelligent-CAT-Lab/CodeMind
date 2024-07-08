import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
var newVariable_0 = Math.abs(x-a);var newVariable_1 = Math.abs(x-b);        if (Math.abs(x-a) < newVariable_1) {
            System.out.println("A");
        } else {
            System.out.println("B");
        }
    }
}