import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;

public class p03933 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        double theta = Math.PI / N;

        double[] A = new double[N - 1];
        for (int i = 0; i < N - 1; i++) {
            A[i] = i * theta;
        }

        double[] sA = new double[N - 1];
        for (int i = 0; i < N - 1; i++) {
            sA[i] = Math.sin(A[i]);
        }

        double x = (left + right) / 2;
        if (test(x)) {
            left = x;
        } else {
            right = x;
        }

        System.out.println(x);
    }

    public static boolean test(double x) {
        double[] diff = new double[N - 1];
        for (int i = 0; i < N - 1; i++) {
            diff[i] = Math.acos(x / sA[i] - Math.cos(A[i] * theta)) / theta;
        }

        int[] upper = new int[N - 1];
        int[] lower = new int[N - 1];
        for (int i = 0; i < N - 1; i++) {
            upper[i] = Math.min(N - A[i] - 1, (N - A[i] + diff[i]) / 2);
            lower[i] = (N - A[i]) - upper[i];
        }

        int cnt = 0;
        for (int i = 0; i < N - 1; i++) {
            cnt += Math.max(0, upper[i] - lower[i] + 1);
        }

        return N * ((N - 1) * (N - 2) / 2 - cnt) < 3 * K;
    }
}