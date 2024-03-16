<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
N, A, B, C, D = map(int, input().split())
MOD = 10 ** 9 + 7
fact = [1] * (N + 1)
frev = [1] * (N + 1)

dp = [0] * (N + 1)
dp[0] = 1

for i in range(1, N + 1):
    v = fact[i] = (fact[i - 1] * i) % MOD
    frev[i] = pow(v, MOD - 2, MOD)

Y = [None] * (N + 1)
for g in range(A, min(N // C, B) + 1):
    p = C * g
    q = D * g
    y = frev[g]
    Y[p: min(q, N) + 1: g] = (pow(y, j, MOD) * frev[j]
                              for j in range(C, min(D, N // g) + 1))
    dp[p:] = (dp[i] + frev[N - i] * sum(dp[i - j] * fact[N - i + j] * Y[j]
              for j in range(p, min(q, i) + 1, g)) % MOD
              for i in range(p, N + 1))

print(dp[N] % MOD)
```
[/INST]
```java
import java.util.*;

public class Main {
    static int N, A, B, C, D;
    static long MOD = 1000000007;
    static long[] fact = new long[N + 1];
    static long[] frev = new long[N + 1];
    static long[] dp = new long[N + 1];
    static long[] Y = new long[N + 1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        Arrays.fill(fact, 1);
        Arrays.fill(frev, 1);

        Arrays.fill(dp, 0);
        dp[0] = 1;

        for (int i = 1; i <= N; i++) {
            fact[i] = (fact[i - 1] * i) % MOD;
            frev[i] = pow(fact[i], MOD - 2, MOD);
        }

        for (int g = A; g <= min(N / C, B); g++) {
            long p = C * g;
            long q = D * g;
            long y = frev[g];
            Arrays.fill(Y, 0, p, g, q, g);
            for (int j = C; j <= min(D, N / g); j++) {
                Y[j] = pow(y, j, MOD);
            }
            dp[p:] = (dp[i] + frev[N - i] * sum(dp[i - j] * fact[N - i + j] * Y[j]
                    for (int j = p; j <= min(q, i); j += g)) % MOD
                    for (int i = p; i <= N; i++));
        }

        System.out.println(dp[N] % MOD);
    }

    static long pow(long a, long b, long mod) {
        long res = 1;
        while (b != 0) {
            if (b % 2 == 1) {
                res = (res * a) % mod;
            }
            a = (a * a) % mod;
            b /= 2;
        }
        return res;
    }

    static long sum(long[] arr) {
        long sum = 0;
        for (long x : arr) {
            sum += x;
        }
        return sum;
    }
}
```</s>
