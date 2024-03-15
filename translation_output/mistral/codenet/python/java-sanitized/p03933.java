import java.util.Scanner;
import java.util.Arrays;

public class p03933 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        double theta = Math.PI / N;
        double[] A = new double[N - 1];
        for (int i = 0; i < N - 1; i++) {
            A[i] = i * theta;
        }
        double[] sA = new double[N - 1];
        for (int i = 0; i < N - 1; i++) {
            sA[i] = Math.sin(A[i]);
        }
        double x = 0;
        int left = 0;
        int right = 4;
        while (left <= right) {
            x = (left + right) / 2;
            if (test(x)) {
                left = x;
            } else {
                right = x;
            }
        }
        System.out.println(x);
    }

    public static boolean test(double x) {
        double diff = Math.acos(x / sA[0] - Math.cos(A[0] * theta)) / theta;
        diff[Double.isNaN(diff)] = -(N + N);
        int upper = Math.min(N - A[0] - 1, (N - A[0] + diff) / 2);
        int lower = N - A[0] - upper;
        int cnt = Math.max(0, upper - lower + 1);
        return N * ((N - 1) * (N - 2) / 2 - cnt) < 3 * K;
    }
}