import java.util.Scanner;

public class p03304 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        double m = scanner.nextDouble();
        double d = scanner.nextDouble();
        scanner.close();

        double result;
        if (d > 0) {
            result = 2 * (n - d) * (m - 1) / (n * n);
        } else {
            result = (m - 1) / n;
        }

        System.out.println(result);
    }
}