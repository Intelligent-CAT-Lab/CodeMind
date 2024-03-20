import java.io.*;
import java.util.*;

public class p03933 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);

        double theta = Math.PI / N;

        double left = 0, right = 4;
        for (int i = 0; i < 100; i++) {
            double x = (left + right) / 2;
            if (test(x, N, K)) {
                left = x;
            } else {
                right = x;
            }
        }
        bw.write(String.format("%.6f", x));
        bw.flush();
    }

    public static boolean test(double x, int N, int K) {
        double theta = Math.PI / N;
        for (int i = 1; i < N - 1; i++) {
            double a = i * theta;
            double sA = Math.sin(a);
            double b = (i + 1) * theta;
            double c = (i + 2) * theta;
            double sB = Math.sin(b);
            double sC = Math.sin(c);
            double cosABC = Math.cos((b - c) * theta) + Math.cos(a * theta);
            double diff = Math.acos(x / sA - cosABC) / theta;
            if (diff < 0) {
                continue;
            }
            int upper = Math.min(N - i - 1, (int) Math.floor((N - i + diff) / 2));
            int lower = (int) Math.ceil((N - i) - upper);
            int cnt = Math.max(0, upper - lower + 1);
            if (N * (N - 1) / 2 - cnt < 3 * K) {
                return true;
            }
        }
        return false;
    }
}