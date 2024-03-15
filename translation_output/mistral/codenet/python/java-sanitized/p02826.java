import java.util.*;
import java.io.*;

public class p02826 {
    static int N, MOD;
    static long fact, fact_inv;
    static long[] inv;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        MOD = Integer.parseInt(st.nextToken());

        fact = 1;
        for (int i = 2; i <= N; i++) {
            fact *= i;
        }

        fact_inv = pow(fact, MOD - 2, MOD);

        inv = new long[N + 1];
        Arrays.fill(inv, 1);
        inv[0] = fact_inv;
        for (int i = 1; i < N; i++) {
            inv[i] = (fact_inv * fact_inv) % MOD;
        }

        Scanner sc = new Scanner(System.in);
        long[] f = new long[N + N + 10];
        for (int i = 1; i < N / 2 + 1; i++) {
            f[i * 2] = 2 * inv[1 + i * 2];
            for (int j = i * 2 + 1; j < i * 2 + i; j++) {
                f[j] = f[j - 1] + f[j - 2];
            }
        }
        if (N % 2 == 1) {
            f[N / 2 * 2] = inv[1 + N / 2 * 2];
        }

        long[] g = fps_exp(f);
        long answer = 0;
        for (int i = 0; i < N; i++) {
            answer += g[i];
        }
        answer %= MOD;

        System.out.println(answer);
    }

    static long pow(long a, long b, long mod) {
        long res = 1;
        while (b != 0) {
            if (b %