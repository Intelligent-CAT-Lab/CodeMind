Here is the Java version of the provided Python code:

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

    public static int comb(int n, int r, int mod) {
        r = Math.min(r, n - r);
        int res = 1;
        for (int i = r; i > 0; i--) {
            res = (int)((long)res * (n - i + 1) % mod * pow(i, mod - 2, mod) % mod);
        }
        return res;
    }

    public static int between(int n, int k, int i) {
        if (i == 1) {
            return 1;
        }
        return comb(k - 1, i - 1, MOD);
    }

    public static int pow(int a, int b, int mod) {
        if (b == 0) {
            return 1;
        }
        int res = pow(a, b / 2, mod);
        res = (int)((long)res * res % mod);
        if (b % 2 == 1) {
            res = (int)((long)res * a % mod);
        }
        return res;
    }
}
```

This Java code does the same thing as the Python code. It reads two integers N and K from the standard input, and then it calculates and prints the result for each integer i
