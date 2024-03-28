import java.util.Scanner;

public class p03304 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int d = scanner.nextInt();
        scanner.close();

        if (d > 0) {
            System.out.printf("%.10f", 2.0 * (n - d) * (m - 1) / (n * n));
        } else {
            System.out.printf("%.10f", (double)(m - 1) / n);
        }
    }
}