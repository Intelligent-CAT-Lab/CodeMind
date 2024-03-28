import java.util.Scanner;

public class p03939 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int d = scanner.nextInt();
        int x = scanner.nextInt();
        scanner.close();

        double result = calculateResult(N, d, x);
        System.out.printf("%.15f%n", result);
    }

    public static double calculateResult(int N, int d, int x) {
        double ret = 0;
        double dD = d;
        double xX = x;

        while (N > 0) {
            ret += dD + (N - 0.5) * xX;
            dD = dD + (dD / N) + (5 * xX) / (2 * N);
            xX += 2 * xX / N;
            N -= 1;
        }
        return ret;
    }
}