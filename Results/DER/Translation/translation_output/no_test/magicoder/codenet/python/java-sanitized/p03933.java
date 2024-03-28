import java.util.*;
import java.lang.*;
import java.io.*;

public class p03933 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        double theta = Math.PI / N;

        double left = 0;
        double right = 4;
        for (int i = 0; i < 100; i++) {
            double x = (left + right) / 2;
            if (test(N, K, theta, x)) {
                left = x;
            } else {
                right = x;
            }
        }
        System.out.println(left);
    }

    private static boolean test(int N, int K, double theta, double x) {
        int cnt = 0;
        for (int a = 1; a < N - 1; a++) {
            double sA = Math.sin(a * theta);
            double diff = Math.acos(x / sA - Math.cos(a * theta)) / theta;
            if (Double.isNaN(diff)) {
                diff = -(N + N);
            }
            int upper = Math.min(N - a - 1, (int) Math.floor((N - a + diff) / 2));
            int lower = N - a - upper;
            cnt += Math.max(0, upper - lower + 1);
        }
        return N * ((N - 1) * (N - 2) / 2 - cnt) < 3 * K;
    }
}