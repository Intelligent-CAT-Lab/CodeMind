<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 1 3 1 2

Expected output:
4


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

java code:<fim_suffix><fim_middle>
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
        int MOD = 1000000007;
        int[] fact = new int[N + 1];
        int[] frev = new int[N + 1];
        fact[0] = 1;
        frev[0] = 1;
        for (int i = 1; i <= N; i++) {
            fact[i] = (fact[i - 1] * i) % MOD;
            frev[i] = (int) Math.pow(fact[i], MOD - 2, MOD);
        }
        int[] dp = new int[N + 1];
        dp[0] = 1;
        for (int g = A; g <= Math.min(N / C, B); g++) {
            int p = C * g;
            int q = D * g;
            int y = frev[g];
            int[] Y = new int[q - p + 1];
            for (int j = C; j <= Math.min(D, N / g); j++) {
                Y[j - p] = (int) ((Math.pow(y, j, MOD) * frev[j]) % MOD);
            }
            for (int i = p; i <= N; i++) {
                dp[i] = (dp[i] + frev[N - i] * (Arrays.stream(dp).limit(i - p).map(x -> (int) ((x * fact[N - i + p] * Arrays.stream(Y).limit(i - p).map(y -> y).reduce(0, (a, b) -> (a + b) % MOD)).reduce(0, (a, b) -> (a + b) % MOD))).reduce(0, (a, b) -> (a + b) % MOD))) % MOD;
            }
        }
        System.out.println(dp[N]);
    }
}
```
'''
<|endoftext|>
