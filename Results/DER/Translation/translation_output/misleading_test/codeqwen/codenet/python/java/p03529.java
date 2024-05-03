Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int mod = (int)1e9 + 7;
        int[] lis = new int[3300];
        lis[0] = 1;

        for (int i = N; i > 0; i--) {
            int[] nlis = new int[3300];

            for (int j = 0; j <= K; j++) {
                for (int last = 0; last < 3300; last++) {
                    if (i < j) {
                        nlis[last] += lis[last];
                        nlis[last] %= mod;
                    } else if ((last + j) / i + last < 3300) {
                        nlis[last + (last + j) / i] += lis[last];
                        nlis[last + (last + j) / i] %= mod;
                    }
                }
            }

            lis = nlis;
        }

        int ans = K * (K + 1) / 2 * pow(K + 1, N - 1, mod) * N;

        for (int i = 0; i < 3300; i++) {
            ans -= lis[i] * i;
            ans %= mod;
        }
        System.out.println(ans);
    }

    public static int pow(int base, int exp, int mod) {
        if (exp == 0) {
            return 1;
        } else if (exp % 2 == 0) {
            return pow(base * base % mod, exp / 2, mod);
        } else {
            return base * pow(base * base % mod, (exp - 1) / 2, mod) % mod;
        }
    }
}
```

This Java code does the same thing as the Python code. It
