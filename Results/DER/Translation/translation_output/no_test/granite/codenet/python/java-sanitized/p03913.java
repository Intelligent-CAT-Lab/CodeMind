import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class p03913 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        long N = Long.parseLong(inputs[0]);
        long A = Long.parseLong(inputs[1]);
        long answer = Long.MAX_VALUE;
        for (int K = 1; K <= 49; K++) {
            long x = 1;
            long y = K - 1;
            long n = (long) Math.pow(N, 1.0 / K);
            while (Math.pow(n, x) * Math.pow(n + 1, y) < N) {
                if (x > y) {
                    y++;
                } else {
                    x++;
                }
            }
            long cost = A * (K - 1) + n * x + (n + 1) * y;
            answer = Math.min(answer, cost);
        }
        System.out.println(answer);
    }
}