import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class p03933 {
    private static final double PI = Math.PI;
    private static int N, K;
    private static double theta;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        K = Integer.parseInt(input[1]);
        theta = PI / N;

        double left = 0;
        double right = 4;
        for (int i = 0; i < 100; i++) {
            double x = (left + right) / 2;
            if (test(x)) {
                left = x;
            } else {
                right = x;
            }
        }
        System.out.println(left);
    }

    private static boolean test(double x) {
        int cnt = 0;
        for (int a = 1; a < N - 1; a++) {
            double sA = Math.sin(a * theta);
            if (sA == 0) continue;
            double diff = Math.acos(x / sA - Math.cos(a * theta)) / theta;
            if (Double.isNaN(diff)) diff = -(N + N);
            int upper = Math.min(N - a - 1, (N - a + diff) / 2);
            int lower = (N - a) - upper;
            cnt += Math.max(0, upper - lower + 1);
        }
        return N * ((N - 1) * (N - 2) / 2 - cnt) < 3 * K;
    }
}