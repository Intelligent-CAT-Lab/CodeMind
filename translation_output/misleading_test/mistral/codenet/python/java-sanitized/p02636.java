import java.util.*;

public class p02636 {
    static int mod = 998244353;
    static int N = 2 * 10 ** 3;
    static int[] g1 = new int[N + 1];
    static int[] g2 = new int[N + 1];
    static int[] inverse = new int[N + 1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int[] data = new int[N][N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    data[i][j][k] = 0;
                }
            }
        }
        for (int i = 0; i < N; i++) {
            g1[i] = (g1[i - 1] * (i + 1)) % mod;
            inverse[i] = (inverse[mod % (i + 1)] * (mod / (i + 1))) % mod;
            g2[i] = (g2[i - 1] * inverse[i + 1]) % mod;
        }
        inverse[0] = 0;

        for (int i = 1; i < N; i++) {
            for (int j = 1; j < N; j++) {
                for (int k = 1; k < N; k++) {
                    if (S == 0) {
                        data[i - 1][j - 1][k - 1] = 1;
                    } else if (S == 1) {
                        data[i - 1][j - 1][k - 1] = -1;
                    }
                }
            }
        }

        int ans = 0;
        for (int i = 1; i < N; i++) {
            for (int j = 1; j < N; j++) {
                for (int k = 1; k < N; k++) {
                    if (data[N - i][j - 1][k - 1] >= 0 || data[N - i][j - 1][k - 1] == -1) {
                        ans += cmb(N - i, j - 1, mod);
                    }
                }
            }
        }

        System