import java.util.*;
import java.io.*;

public class p03933 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int K = Integer.parseInt(str[1]);
        double theta = Math.PI / N;
        double left = 0, right = 4;
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

    public static boolean test(double x, int N, int K, double theta) {
        double[] A = new double[N - 2];
        for (int i = 0; i < N - 2; i++) {
            A[i] = i + 1;
        }
        double[] sA = new double[N - 2];
        for (int i = 0; i < N - 2; i++) {
            sA[i] = Math.sin(A[i] * theta);
        }
        double[] diff = new double[N - 2];
        for (int i = 0; i < N - 2; i++) {
            diff[i] = Math.acos(x / sA[i] - Math.cos(A[i] * theta)) / theta;
        }
        for (int i = 0; i < N - 2; i++) {
            if (Double.isNaN(diff[i])) {
                diff[i] = -(N + N);
            }
        }
        int[] upper = new int[N - 2];
        int[] lower = new int[N - 2];
        for (int i = 0; i < N - 2; i++) {
            upper[i] = (int) Math.min(N - 1 - A[i], (N - 1 - A[i] + diff[i]) / 2);
            lower[i] = (int) (N - 1 - A[i] - upper[i]);
        }
        int cnt = 0;
        for (int i = 0; i < N - 2; i++) {
            cnt += Math.max(0, upper[i] - lower[i] + 1);
        }
        return N * (N - 1) * (N - 2) / 2 - cnt < 3 * K;
    }
}