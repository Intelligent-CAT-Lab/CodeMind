import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class p03913 {
    static long N, A;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        N = Long.parseLong(input[0]);
        A = Long.parseLong(input[1]);

        long answer = Arrays.stream(new long[49])
                .parallel()
                .map(Main::F)
                .min()
                .getAsLong();

        System.out.println(answer);
    }

    static long F(long K) {
        long n = (long) Math.pow(N, 0.5);
        while ((n-1)*Math.pow(n, K) > N) {
            n--;
        }
        while (n * Math.pow(n+1, K) < N) {
            n++;
        }
        for (long y = 0; y < K; y++) {
            long x = K-y;
            if (Math.pow(n, x) * Math.pow(n+1, y) >= N) {
                break;
            }
        }
        long cost = A*(K-1) + n*x + (n+1)*y;
        return cost;
    }
}