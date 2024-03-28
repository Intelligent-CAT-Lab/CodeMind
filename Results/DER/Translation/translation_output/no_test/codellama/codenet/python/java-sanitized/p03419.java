import java.util.Scanner;

public class p03419 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        if (n == 1 || m == 1) {
            System.out.println(1);
        } else {
            System.out.println((n - 2) * (m - 2));
        }
    }
}