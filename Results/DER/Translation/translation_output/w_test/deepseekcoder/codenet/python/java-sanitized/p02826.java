import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class p02826 {
    static final long MOD = (long) 1e9 + 7;
    static long[] fact, factInv;
    static long[] inv;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        makeFact(100000);
        long[] f = new long[N + N + 10];
        for (int x = 1; x <= N / 2; x++) {
            f[x] += 2 * inv[1, (int) ((f.length - 1) / x) + 1];
        }
        if ((N & 1) == 1) {
            int x = (N + 1) / 2;
            f[x] += inv[1, (int) ((f.length - 1) / x) + 1];
        }
        long[] g = fpsExp(f);
        long answer = 0;
        for (int i = 0; i < N; i++) {
            answer = (answer + g[i]) % MOD;
        }
        System.out.println(answer);
    }

    static void makeFact