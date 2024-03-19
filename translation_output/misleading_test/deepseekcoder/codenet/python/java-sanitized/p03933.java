import java.util.Scanner;
import java.lang.Math;

public class p03933 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        double theta = Math.PI / N;

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
        System.out.println(left);
    }

    private static boolean test(double x, int N, int K, double theta) {
        int cnt = 0;
        for (int a = 1; a < N - 1; a++) {
            double sA = Math.sin(a * theta);
            if (sA != 0) {
                double diff = Math.acos(x / sA - Math.cos(a * theta)) / theta;
                int upper = Math.min(N - a - 1, (int) ((N - a + diff) / 2));
                int lower = (N - a) - upper;
                cnt += Math.max(0, upper - lower + 1);
            }
        }
        return N * ((N - 1) * (N - 2) / 2 - cnt) < 3 * K;
    }
}