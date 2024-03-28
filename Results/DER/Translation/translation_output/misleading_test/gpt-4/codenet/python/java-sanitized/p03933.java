import java.util.Scanner;
import java.util.Arrays;

public class p03933 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        double theta = Math.PI / N;

        double left = 0;
        double right = 4;
        for (int i = 0; i < 100; i++) {
            double x = (left + right) / 2;
            if (test(x, theta, N, K)) {
                left = x;
            } else {
                right = x;
            }
        }
        System.out.println(left);
        sc.close();
    }

    private static boolean test(double x, double theta, int N, int K) {
        int[] A = new int[N - 2];
        for (int i = 1; i < N - 1; i++) {
            A[i - 1] = i;
        }
        double[] sA = new double[N - 2];
        for (int i = 0; i < N - 2; i++) {
            sA[i] = Math.sin(A[i] * theta);
        }
        double[] diff = new double[N - 2];
        Arrays.fill(diff, -(N + N));
        for (int i = 0; i < N - 2; i++) {
            if (x / sA[i] - Math.cos(A[i] * theta) >= -1 && x / sA[i] - Math.cos(A[i] * theta) <= 1) {
                diff[i] = Math.acos(x / sA[i] - Math.cos(A[i] * theta)) / theta;
            }
        }
        int cnt = 0;
        for (int i = 0; i < N - 2; i++) {
            int upper = Math.min(N - A[i] - 1, (int) ((N - A[i] + diff[i]) / 2));
            int lower = (N - A[i]) - upper;
            cnt += Math.max(0, upper - lower + 1);
        }
        return N * ((N - 1) * (N - 2) / 2 - cnt) < 3 * K;
    }
}