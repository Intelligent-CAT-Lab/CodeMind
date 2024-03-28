```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int mod = 924844033;
        int rng = 2010;
        ArrayList<Integer> fctr = new ArrayList<>();
        ArrayList<Integer> finv = new ArrayList<>();
        
        fctr.add(1);
        finv.add(1);
        for (int i = 1; i < rng; i++) {
            fctr.add((int) ((long) fctr.get(i-1) * i % mod));
        }
        for (int i = 1; i < rng; i++) {
            finv.add(pow(fctr.get(i), mod-2, mod));
        }

        // Function to calculate combination using factorials
        Function<Integer, Integer> cmb = (n, k) -> {
            if (n < 0 || k < 0) {
                return 0;
            } else {
                return (int) ((long) fctr.get(n) * finv.get(n-k) % mod * finv.get(k) % mod);
            }
        };

        if ((n - k) * 2 <= n) {
            int x = (n - k) * 2;
            int ans = 0;
            for (int i = 0; i < x+1; i++) {
                if (i % 2 == 0) {
                    ans = (ans + (int) ((long) cmb.apply(x, i) * fctr.get(n-i) % mod)) % mod;
                } else {
                    ans = (ans - (int) ((long) cmb.apply(x, i) * fctr.get(n-i) % mod) + mod) % mod;
                }
            }
            System.out.println(ans);
            return;
        }

        Map<Integer, Integer> dc = new HashMap<>();
        for (int j = 1; j < k+1; j++) {
            int a = j;
            int b = k+j;
            int cnt = 0;
            while (a <= n && b <= n) {
                if (a > b) {
                    b += 2 * k;
                } else {
                    a += 2 * k;
                }
                cnt++;
            }
            dc.put(cnt, 2);
        }

        int nn = (n - k) * 2;
        Set<Integer> cp = new HashSet<>();
        int cpp = 1;
        for (Map.Entry<Integer, Integer> entry : dc.entrySet()) {
            for (int j = 0; j < entry.getValue(); j++) {
                cpp += entry.getKey();
                cp.add(cpp);
            }
        }
        cp.add(1);

        int[][] dp = new int[nn+1][n+1];
        dp[0][0] = 1;

        for (int i = 1; i < nn+1; i++) {
            dp[i] = Arrays.copyOf(dp[i-1], dp[i-1].length);
            if (!cp.contains(i)) {
                for (int j = 1; j <= Math.min(i, n); j++) {
                    dp[i][j] = (dp[i][j] + dp[i-2][j-1]) % mod;
                }
            } else {
                for (int j = 1; j <= Math.min(i, n); j++) {
                    dp[i][j] = (dp[i][j] + dp[i-1][j-1]) % mod;
                }
            }
        }

        int ans = 0;
        for (int i = 0; i < n+1; i++) {
            if (i % 2 == 0) {
                ans = (ans + (int) ((long) fctr.get(n-i) * dp[nn][i] % mod)) % mod;
            } else {
                ans = (ans - (int) ((long) fctr.get(n-i) * dp[nn][i] % mod) + mod) % mod;
            }
        }
        System.out.println(ans);
    }

    public static int pow(int base, int exp, int mod) {
        int result = 1;
        while (exp > 0) {
            if (exp % 2 == 1) {
                result = (int) ((long) result * base % mod);
            }
            base = (int) ((long) base * base % mod);
            exp /= 2;
        }
        return result;
    }
}
```
```
