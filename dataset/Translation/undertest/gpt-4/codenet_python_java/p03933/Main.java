import java.util.Scanner;

public class p03933 {
    private static final double PI = Math.PI;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        scanner.close();
        
        double theta = PI / N;

        double left = 0;
        double right = 4;
        for (int i = 0; i < 100; i++) {
            double x = (left + right) / 2;
            if (test(x, N, K, theta)) {
                left = x;
            } else {
                right = x;
            }
        }
        System.out.printf("%.13f\n", left);
    }

    private static boolean test(double x, int N, int K, double theta) {
        int cnt = 0;
        for (int A = 1; A < N - 1; A++) {
            double sA = Math.sin(A * theta);
            double cosPart = Math.cos(A * theta);
            double acosArgument = x / sA - cosPart;

            if (acosArgument <= -1 || acosArgument >= 1) {
                continue;
            }

            double diff = Math.acos(acosArgument) / theta;
            if (Double.isNaN(diff)) {
                diff = -(N + N);
            }

            int upper = Math.min(N - A - 1, (int) ((N - A + diff) / 2));
            int lower = (N - A) - upper;
            cnt += Math.max(0, upper - lower + 1);
        }
        return N * ((N - 1) * (N - 2) / 2 - cnt) < 3 * K;
    }
}