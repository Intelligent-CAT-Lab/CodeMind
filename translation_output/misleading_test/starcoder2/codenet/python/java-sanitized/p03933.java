import java.util.*;
import java.io.*;
import java.math.*;

public class p03933 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        double left = 0;
        double right = 4;
        for (int i = 0; i < 100; i++) {
            double x = (left + right) / 2;
            if (test(N, K, x)) {
                left = x;
            } else {
                right = x;
            }
        }
        System.out.println(left);
    }

    public static boolean test(int N, int K, double x) {
        double theta = Math.PI / N;
        int[] A = new int[N - 1];
        for (int i = 0; i < N - 1; i++) {
            A[i] = i + 1;
        }
        double[] sA = new double[N - 1];
        for (int i = 0; i < N - 1; i++) {
            sA[i] = Math.sin(A[i] * theta);
        }
        double[] diff = new double[N - 1];
        for (int i = 0; i < N - 1; i++) {
            diff[i] = Math.acos(x / sA[i] - Math.cos(A[i] * theta)) / theta;
        }
        int[] upper = new int[N - 1];
        int[] lower = new int[N - 1];
        for (int i = 0; i < N - 1; i++) {
            if (Double.isNaN(diff[i])) {
                upper[i] = -(N + N);
            } else {
                upper[i] = Math.min(N - A[i] - 1, (N - A[i] + diff[i]) / 2);
            }
            lower[i] = (N - A[i]) - upper[i];
        }
        int cnt = 0;
        for (int i = 0; i < N - 1; i++) {
            cnt += Math.max(0, upper[i] - lower[i] + 1);
        }
        return N * ((N - 1) * (N - 2) / 2 - cnt) < 3 * K;
    }
}