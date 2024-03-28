import java.util.*;
import java.io.*;

public class p04004 {
    static int MOD = 1000000007;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[][] arr = new int[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[] power2 = new int[N + M];
        int[] power3 = new int[N + M];
        int[] fact = new int[N + M];
        int[] fact_inv = new int[N + M];

        Arrays.fill(power2, 1);
        Arrays.fill(power3, 1);
        Arrays.fill(fact, 1);
        Arrays.fill(fact_inv, 1);

        for (int i = 2; i <= N + M; i++) {
            power2[i] = power2[i - 1] * 2 % MOD;
            power3[i] = power3[i - 1] * 3 % MOD;
            fact[i] = fact[i - 1] * i % MOD;
            fact_inv[i] = fact_inv[i - 1] * (MOD - fact[i - 1]) % MOD;
        }

        int[] x = new int[N + M];
        Arrays.fill(x, 0);
        x[1] = power2[N + M - 1];
        for (int i = 2; i <= N + M; i++) {
            x[i] = (x[i - 1] * power2[i - 2] * power3_inv[K + 1 + i - 2] % MOD) % MOD;
            x[i] *= fact[K + 1 + i - 2] * fact_inv[K] * fact_inv[1 + i - 2] % MOD;
        }
        x[0] = 3 * (1 - power3_inv[K + 1]) % MOD * power2_inv[1] % MOD;
        for (int i = 1; i <= N + M; i++) {
            x[i] = (x[i - 1] + x[i]) % MOD;
        }

        int[] coef = new int[N + M];
        Arrays.fill(coef, 0);
        coef[N - 1] = fact[N - 1];
        coef[N] = fact_inv[M];
        coef[N - 1] *= power3[K + 1 + N - 1][::-1];
        coef[N] *= power3[K + 1 + M + N - 1][::-1];
        coef[N - 1] *= fact_inv[K];
        coef[N] *= fact_inv[N - 1];
        Arrays.fill(coef, coef[N - 1] + coef[N], coef.length);
        coef[N - 1] = (coef[N - 1] * x[N - 1] + coef[N] * x[N]) % MOD;
        coef[N] = (coef[N - 1] + coef[N]) % MOD;

        int answer = 0;
        for (int i = N - 1; i <= N + M - 1; i++) {
            answer += coef[i] * arr[i - N + 1][i - N];
        }
        answer %= MOD;
        System.out.println(answer);
    }
}