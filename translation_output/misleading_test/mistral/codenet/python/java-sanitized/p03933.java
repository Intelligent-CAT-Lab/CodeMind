import java.util.Scanner;
import java.util.Arrays;

public class p03933 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        double theta = Math.PI / N;
        double x = 0;
        int left = 0;
        int right = N;
        while (left < right) {
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
        double[] A = new double[N - 1];
        for (int i = 1; i < N - 1; i++) {
            A[i] = Math.sin(i * theta);
        }
        // sin(b)sin(c) > x / 2sA
        // cos((b-c)theta) + cos(a theta) > x/sA
        double diff = Math.acos(x / A[0] - Math.cos(A[1] * theta)) / theta;
        diff[Double.isNaN(diff)] = -(N + N);
        int upper = Math.min(N - A[0] - 1, (N - A[0] + diff) / 2);
        int lower = N - A[0] - upper;
        int cnt = Math.max(0, upper - lower + 1);
        return N * ((N - 1) * (N - 2) / 2 - cnt) < 3 * K;
    }
}