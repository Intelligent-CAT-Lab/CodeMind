import java.util.Scanner;

public class p03419 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, m;
        n = scanner.nextInt();
        m = scanner.nextInt();
        if (n == 1 || m == 1) {
            System.out.println(n * m == 1 ? 1 : Math.max(n, m) - 2);
        } else {
            System.out.println((n - 2) * (m - 2));
        }
    }
}