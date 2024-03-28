Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 1 3 1 2

Expected output:
49

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

### Response:
```java
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int MOD = (int) Math.pow(10, 9) + 7;

        int[] fact = new int[N + 1];
        int[] frev = new int[N + 1];

        fact[0] = 1;
        for (int i = 1; i <= N; i++) {
            fact[i] = (fact[i - 1] * i) % MOD;
            frev[i] = pow(fact[i], MOD - 2, MOD);
        }

        int[] dp = new int[N + 1];
        dp[0] = 1;

        for (int g = A; g <= Math.min(N / C, B); g++) {
            int p = C * g;
            int q = D * g;
            int y = frev[g];
            Arrays.fill(dp, p, Math.min(q, N) + 1, 0);
            for (int j = C; j <= Math.min(D, N / g); j++) {
                int k = j * g;
                if (k <= N) {
                    dp[k] = (dp[k] + frev[N - k] * sum(dp[k - l] * fact[N - k + l] * pow(y, l, MOD) * frev[l] % MOD
                            for (int l = p; l <= Math.min(q, k); l += g)) % MOD) % MOD;
                }
            }
        }

        System.out.println(dp[N]);
    }

    public static int pow(int a, int b, int mod) {
        int res = 1;
        while (b > 0) {
            if ((b & 1) == 1) {
                res = (res * a) % mod;
            }
            a = (a * a) % mod;
            b >>= 1;
        }
        return res;
    }

    public static int sum(int[] arr) {
        int res = 0;
        for (int i : arr) {
            res = (res + i) % MOD;
        }
        return res;
    }
}
```<|endoftext|>
