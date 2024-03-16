```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int S = scanner.nextInt();
        final int MOD = (int) Math.pow(10, 9) + 7;
        int ans = 0;

        int r = 1;
        int tot = 1;
        for (int l = 1; l < 10000000; l++) {
            while (tot < S) {
                r++;
                tot += String.valueOf(r).length();
            }
            if (tot == S) ans++;
            tot -= String.valueOf(l).length();
        }

        for (int cnt = 1; cnt <= S; cnt++) {
            int d = S / cnt;
            int m = S % cnt;
            if (d <= 7) break;
            if (m != 0) {
                ans++;
            } else {
                ans += (power(10, d, MOD) - power(10, d - 1, MOD) - cnt + 1);
            }
            ans %= MOD;
        }

        System.out.println(ans % MOD);
    }

    public static long power(int base, int exp, int mod) {
        long result = 1;
        while (exp > 0) {
            if (exp % 2 == 1) {
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            exp /= 2;
        }
        return result;
    }
}
```
```
