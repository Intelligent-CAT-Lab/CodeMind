Here is the corresponding Java code that implements the same logic as the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int S = scanner.nextInt();
        final int MOD = 1000000007;
        int ans = 0;

        // l has <= 7 digits
        int r = 1;
        int tot = 1;
        for (int l = 1; l < 10000000; l++) {
            while (tot < S) {
                r++;
                tot += Integer.toString(r).length();
            }
            if (tot == S) ans++;
            tot -= Integer.toString(l).length();
        }

        // l has > 7 digits
        for (int cnt = 1; cnt <= S; cnt++) {
            int d = S / cnt;
            int m = S % cnt;
            if (d <= 7) break;
            if (m != 0) ans++;
            else ans += (power(10, d, MOD) - power(10, d - 1, MOD) - cnt + 1 + MOD) % MOD;
            ans %= MOD;
        }
        System.out.println(ans % MOD);
    }

    private static long power(long base, long exp, long mod) {
        long result = 1;
        base %= mod;
        while (exp > 0) {
            if ((exp & 1) != 0) {
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            exp >>= 1;
        }
        return result;
    }
}
```

This Java code will prompt for an integer input and print the expected result as per the logic given in the Python script. Just make sure to run the code with a Java runtime environment, and you will be prompted to provide the input from the console.
