```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int H = input.nextInt();
        int D = input.nextInt();
        input.close();

        int MOD = (int) (Math.pow(10, 9) + 7);

        int[] fact = new int[N + 1];
        int[] fact_cum = new int[N + 1];
        fact[0] = 1;
        fact_cum[0] = 0;

        for (int i = 1; i <= N; i++) {
            fact[i] = (int) ((long) fact[i - 1] * i % MOD);
            fact_cum[i] = (fact_cum[i - 1] + fact[i]) % MOD;
        }

        int[] ap = new int[H + 1];
        int[] ap_cum = new int[H + 1];
        ap[0] = 1;
        ap_cum[0] = 1;

        for (int n = 1; n <= H; n++) {
            long x = ap_cum[n - 1];
            if (n > D) {
                x -= ap_cum[n - D - 1];
            }
            x = (x * fact_cum[N]) % MOD;
            ap[n] = (int) x;
            ap_cum[n] = (ap_cum[n - 1] + ap[n]) % MOD;
        }

        long ans = ap[H];
        ans = (ans * fact[N]) % MOD;
        ans = (ans * modInverse(fact_cum[N], MOD)) % MOD;

        System.out.println(ans);
    }

    public static long modInverse(long a, int m) {
        return power(a, m - 2, m);
    }

    public static long power(long x, int y, int p) {
        long res = 1;
        x = x % p;
        while (y > 0) {
            if (y % 2 == 1) {
                res = (res * x) % p;
            }
            y = y >> 1;
            x = (x * x) % p;
        }
        return res;
    }
}
```
```
