import java.util.Scanner;

public class p03545 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = n / 1000;
        int b = (n % 1000) / 100;
        int c = (n % 100) / 10;
        int d = n % 10;

        if (a + b + c + d == 7) {
            System.out.println(a + "+" + b + "+" + c + "+" + d + "=7");
        } else if (a + b + c - d == 7) {
            System.out.println(a + "+" + b + "+" + c + "-" + d + "=7");
        } else if (a + b - c + d == 7) {
            System.out.println(a + "+" + b + "-" + c + "+" + d + "=7");
        } else if (a + b - c - d == 7) {
            System.out.println(a + "+" + b + "-" + c + "-" + d + "=7");
        } else if (a - b + c + d == 7) {
            System.out.println(a + "-" + b + "+" + c + "+" + d + "=7");
        } else if (a - b + c - d == 7) {
            System.out.println(a + "-" + b + "+" + c + "-" + d + "=7");
        } else if (a - b - c + d == 7) {
            System.out.println(a + "-" + b + "-" + c + "+" + d + "=7");
        } else if (a - b - c - d == 7) {
            System.out.println(a + "-" + b + "-" + c + "-" + d + "=7");
        }
    }
}