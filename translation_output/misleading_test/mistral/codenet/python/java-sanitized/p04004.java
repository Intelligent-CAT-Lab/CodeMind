import java.util.*;

public class p04004 {
    static int mod = (int) 1e9 + 7;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();

        int[][] arr = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int[][] power2 = new int[N + M][N + M];
        int[][] power3 = new int[N + M][N + M];
        int[] fact = new int[N + M];
        int[] fact_inv = new int[N + M];

        Arrays.fill(power2, 1);
        Arrays.fill(power3, 1);

        for (int i = 2; i <= N + M; i++) {
            power2[i] = power2[i - 1] * 2 % mod;
            power3[i] = power3[i - 1] * 3 % mod;
        }

        for (int i = 1; i <= N + M; i++) {
            fact[i] = i;
            fact_inv[i] = mod - fact[i];
        }

        int x[] = new int[N + M];
        Arrays.fill(x, 0);

        for (int i = 1; i <= N + M; i++) {
            x[i] = (power2[i - 1] * power3_inv[K + 1 + i] % mod) % mod;
            x[i] *= fact[K + 1 + i] * fact_inv[K] % mod * fact_inv[1 + i] % mod;
            x[i] %= mod;
        }

        x[0] = 3 * (1 - power3_inv[K + 1]) % mod * power2_inv[1] % mod;

        Arrays.stream(x).forEach(i -> x[i] = (x[i] + N) % mod);

        Arrays.stream(x).forEach(i -> x[i] *= power3[i] * power2_inv[i] % mod);
        x[0] = (x[0] + N) % mod;

        int coef[] = new int[N + M];
        Arrays.fill(coef, 0);

        for (int i = N - 1; i <= N + M - 1; i++) {
            coef[i] = fact[N + M - 1 - i] * fact_inv[M] % mod * fact_inv[N - 1] % mod;
            coef[i] *= power3[K + 1 + i][::-1];
            coef[i] %= mod;
        }

        int answer = 0;
        for (int i = 0; i < N + M; i++) {
            answer += coef[i] * x[i] % mod;
        }

        System.out.println(answer);
    }
}