Below is the translated Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int K = sc.nextInt();
        K = Math.min(K, 300);
        int mod = 998244353;

        int val = 0;
        int[] a = new int[S.length()];
        int m = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '0') {
                if (val != 0) {
                    a[m++] = val;
                }
                val = 0;
            } else {
                val++;
            }
        }

        if (val != 0) {
            a[m++] = val;
        }

        K = Math.min(m == 0 ? 0 : m, K);

        int[][][] dp = new int[m + 1][K + 1][K + 1];

        for (int j = 0; j <= K; j++) {
            dp[m][j][j] = 1;
        }

        int[] b = new int[m + 1];
        int[] c = new int[m];
        for (int i = 0; i < m; i++) {
            b[i + 1] = a[i];
            c[i] = a[i];
        }
        for (int i = 1; i <= m; i++) {
            b[i] += b[i - 1];
        }
        for (int i = m - 2; i >= 0; i--) {
            c[i] += c[i + 1];
        }

        for (int i = m - 1; i >= 0; i--) {
            for (int k = 0; k <= Math.min(b[i], K); k++) {
                for (int j = 0; j <= Math.min(K, k + c[i]); j++) {
                    int M = Math.max(k - j, -a[i]);
                    long sum = 0;
                    
                    for (int l = Math.max(0, M); l <= K - j; l++) {
                        sum += dp[i + 1][j + l][k];
                    }
                    for (int l = 1; l <= Math.min(K - k, -M); l++) {
                        sum += dp[i + 1][j][k + l];
                    }
                    dp[i][j][k] = (int)(sum % mod);
                }
            }
        }

        System.out.println(dp[0][0][0]);
        sc.close();
    }
}
```

To test if the Java code works properly, provide an input like "0101 1" to the program, and you should receive the expected output of 89.
