```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int mod = (int) Math.pow(10, 9) + 7;
        int[] lis = new int[3300];
        lis[0] = 1;

        for (int i = N; i > 0; i--) {
            int[] nlis = new int[3300];

            for (int j = 0; j < K + 1; j++) {
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

        long ans = (long) K * (K + 1) / 2 * pow(K + 1, N - 1, mod) * N % mod;

        for (int i = 0; i < 3300; i++) {
            ans -= (long) lis[i] * i;
            ans = (ans + mod) % mod;
        }

        System.out.println(ans);
    }

    public static long pow(int base, int exp, int mod) {
        if (exp == 0) {
            return 1;
        }
        if (exp % 2 == 1) {
            return (long) base * pow(base, exp - 1, mod) % mod;
        }
        long sqrt = pow(base, exp / 2, mod);
        return sqrt * sqrt % mod;
    }
}
```

