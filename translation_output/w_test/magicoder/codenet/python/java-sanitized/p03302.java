import java.util.Scanner;

public class p03302 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        if (a + b == 15) {
            System.out.println('+');
        } else if (a * b == 15) {
            System.out.println('*');
        } else {
            System.out.println('x');
        }
    }
}