import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class p02826 {
    static final long MOD = (long)1e9+7;
    static long[] fact, factInv;
    static long[] inv;
    static int U = 100000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        makeFact(U);
        long[] f = new long[N+N+10];
        for (int x = 1; x <= N/2; x++) {
            for (int i = 1; i <= (N-1)/x+1; i++) {
                f[x::x] += 2 * inv[i];
            }
        }
        if (N % 2 == 1) {
            int x = (N+1)/2;
            for (int i = 1; i <= (N-1)/x+1; i++) {
                f[x::x] += inv[i];
            }
        }
        long[] g = fpsExp(f);
        long answer = 0;
        for (int i = 0; i < N; i++) {
            answer += g[i];
        }
        System.out.println(answer % MOD);
    }

    static void makeFact(int U) {
        fact = new long[U+1];
        factInv = new long[U