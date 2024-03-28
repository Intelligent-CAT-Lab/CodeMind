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

        int[][] power2 = new int[1 << (int) Math.pow(2, N + M)][N + M];
        int[][] power3 = new int[1 << (int) Math.pow(3, N + M)][N + M];
        int[] fact = new int[N + M];
        int[] fact_inv = new int[N + M];

        Arrays.fill(fact, 1);
        Arrays.fill(fact_inv, 1);

        for (int i = 2; i <= N + M; i++) {
            fact[i] = fact[i - 1] * i;
            fact_inv[i] = fact_inv[i - 1] * (mod - fact[i - 1]);
        }

        for (int i = 0; i < N + M; i++) {
            power2[1 << i][i] = 2;
            power2[1 << i][i] = (power2[1 << i][i] * power2[1 << (i - 1)][i]) % mod;
            for (int j = 1; j < i; j++) {
                power2[1 << i][i] = (power2[1 << i][i] * power2[1 << (i - 1)][j]) % mod;
            }
            power2[1 << i][i] = (power2[1 << i][i] * power2[1 << (i - 1)][i - 1]) % mod;
        }

        for (int i = 0; i < N + M; i++) {
            power3[1 << i][i] = 3;
            power3[1 << i][i] = (power3[1 << i][i] * power3[1 << (i - 1)][i]) % mod;
            for (int j = 1; j < i; j++) {
                power3[1 << i][i] = (power3[1 << i][i] * power3[1 << (i - 1)][j]) % mod;
            }
            power3[1 << i][i] = (power3[1 << i][i] * power3[1 << (i - 1)][i - 1]) % mod;
        }

        int[] x = new int[N + M];
        Arrays.fill(x, -1);
        for (int i = 1; i < N + M; i++) {
            x[i] = (power2[1 << (N + M - 1)][i - 1] * power3_inv[K + 1][i] % mod) % mod;
            x[i] = (x[i] * fact[K + 1][i - 1] * fact_inv[K][i - 1] % mod * fact_inv[1][i - 1] % mod) % mod;
            x[i] = (x[i] * fact[1][i - 1] * fact_inv[1][N + M - i] % mod) % mod;
            x[i] = (x[i] * power3[K][i - 1] * power2_inv[1][i - 1] % mod) % mod;
        }

        int coef = fact[N - 1][N - 1] * fact_inv[M][M] * fact_inv[N - 1][N - 1] % mod;
        coef = (coef * power3[K][K] * power2_inv[1][1]) % mod;
        coef = (coef * x[N - 1]) % mod;

        int answer = 0;
        for (int i = N - 1; i < N + M; i++) {
            answer = (answer + x[i]) % mod;
        }

        System.out.println(answer);
    }
}