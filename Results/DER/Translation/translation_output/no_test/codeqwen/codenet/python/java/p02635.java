Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] S_K = scanner.nextLine().split(" ");
        int K = Integer.parseInt(S_K[1]);
        K = Math.min(K, 300);
        int mod = 998244353;
        int[] a = new int[S_K[0].length()];
        int val = 0;
        for (int i = 0; i < S_K[0].length(); i++) {
            if (S_K[0].charAt(i) == '0') {
                a[i] = val;
                val = 0;
            } else {
                val++;
            }
        }
        if (val != 0) {
            a[S_K[0].length()] = val;
        }
        int m = a.length;
        K = Math.min(getSum(a), K);

        int[][][] dp = new int[m + 1][K + 1][K + 1];

        for (int j = 0; j <= K; j++) {
            dp[m][j][j] = 1;
        }

        int[] b = new int[m];
        int[] c = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = a[i];
            if (i > 0) {
                b[i] += b[i - 1];
            }
        }
        b[0] = 0;
        for (int i = m - 2; i >= 0; i--) {
            c[i] = a[i];
            if (i < m - 1) {
                c[i] += c[i + 1];
            }
        }
        for (int i = m - 1; i >= 0; i--) {
            for (int
