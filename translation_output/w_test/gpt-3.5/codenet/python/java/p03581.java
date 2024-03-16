```java
import java.io.InputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        final int MOD = (int) (Math.pow(10, 9) + 7);

        int U = 2001;
        long[][] comb = new long[U][U];
        comb[0][0] = 1;
        for (int n = 1; n < U; n++) {
            for (int i = 0; i < n; i++) {
                comb[n][0] += comb[n - 1][i];
                comb[n][1 + i] += comb[n - 1][i];
                comb[n][i] %= MOD;
                comb[n][1 + i] %= MOD;
            }
        }

        long[][] combCum = new long[U][U];
        for (int i = 0; i < U; i++) {
            for (int j = 0; j < U; j++) {
                if (j == 0) {
                    combCum[i][j] = comb[i][j];
                } else {
                    combCum[i][j] = combCum[i][j - 1] + comb[i][j];
                    combCum[i][j] %= MOD;
                }
            }
        }

        long[][] S = new long[U][U];
        S[0][0] = 1;
        for (int i = 1; i < U; i++) {
            for (int j = 1; j < U; j++) {
                S[i][j] = (S[i][j - 1] + combCum[i - 1][j - 1]) % MOD;
            }
        }

        long x = 0;
        for (int k = 0; k <= A; k++) {
            x += (comb[B - 1][k] * (getSum(S, k, A - k + 1) % MOD)) % MOD;
            x %= MOD;
        }
        System.out.println(x);

        scanner.close();
    }

    public static long getSum(long[][] S, int row, int col) {
        long sum = 0;
        for (int i = 0; i < col; i++) {
            sum += S[row][i];
            sum %= MOD;
        }
        return sum;
    }
}
```
```
