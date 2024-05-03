Here is the Java version of the code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int MOD = (int) (Math.pow(10, 9) + 7);

        int[][] comb = new int[2001][2001];
        comb[0][0] = 1;
        for (int n = 1; n < 2001; n++) {
            for (int k = 0; k < n; k++) {
                comb[n][k] = (comb[n - 1][k] + comb[n - 1][k + 1]) % MOD;
            }
        }

        int[][] combCum = new int[2001][2001];
        for (int n = 0; n < 2001; n++) {
            for (int k = 0; k < n; k++) {
                combCum[n][k] = (combCum[n - 1][k] + combCum[n - 1][k + 1]) % MOD;
            }
        }

        int[][] S = new int[2001][2001];
        S[0][0] = 1;
        for (int n = 1; n < 2001; n++) {
            for (int k = 0; k < n; k++) {
                S[n][k] = (combCum[n - 1][k] + S[n - 1][k]) % MOD;
            }
        }

        int x = 0;
        for (int k = 0; k <= A; k++) {
            x = (x + comb[B - 1][k] * S[k][A - k]) % MOD;
        }
        System.out.println(x);
    }
}
```

Please note that Java does not have a built-in function to calculate the cumulative sum of a 2D array
