Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int MOD = (int)1e9 + 7;

        for (int i = 1; i <= K; i++) {
            if (i > K || i > N - K + 1) {
                System.out.println(0);
            } else {
                int ans = comb(N - K + 1, i, MOD) * between(N, K, i);
                ans %= MOD;
                System.out.println(ans);
            }
        }
    }

    public static int between(int n, int k, int i) {
        if (i == 1) {
            return 1;
        }
        return comb(k - 1, i - 1, MOD);
    }

    public static int comb(int n, int r, int mod) {
        r = Math.min(r, n - r);
        int res = 1;
        for (int i = 0; i < r; i++) {
            res = res * (n - i) * pow(i + 1, mod - 2, mod) % mod;
        }
        return res;
    }

    public static int pow(int base, int exp, int mod) {
        if (exp == 0) {
            return 1;
        }
        int half = pow(base, exp / 2, mod);
        if (exp % 2 == 0) {
            return (half * half) % mod;
        } else {
            return (half * half * base) % mod;
        }
    }
}
```

Please note that Java does not have a built-in function for factorial or combination calculation, so I have implemented the `comb` and `pow` functions manually. Also, Java does not have a built-in function for modular exponentiation, so I have implemented it
