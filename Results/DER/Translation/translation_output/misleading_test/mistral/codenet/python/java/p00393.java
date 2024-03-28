<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 3

Expected output:
-6

```
MOD = 1000000007

N, M = (int(x) for x in input().split())

pow = [0] * (N + 1)
dp = [0] * (N + 1)

pow[0] = 1

for i in range(1, N + 1):
    pow[i] = pow[i - 1] * 2
    pow[i] %= MOD

dp[0] = 1

for i in range(1, M + 1):
    dp[i] = pow[i]

dp[M] -= 1

for i in range(M + 1, N + 1):
    dp[i] = dp[i - 1] + (dp[i - 1] - dp[i - 1 - M])
    dp[i] %= MOD

print((pow[N] - dp[N] + MOD) % MOD)


```
[/INST]
```java
import java.util.*;

public class Main {
    final static int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, M;
        while (sc.hasNext()) {
            N = sc.nextInt();
            M = sc.nextInt();
            int ans = solve(N, M);
            System.out.println(ans);
        }
    }

    static int solve(int N, int M) {
        int[] pow = new int[N + 1];
        int[] dp = new int[N + 1];

        pow[0] = 1;

        for (int i = 1; i <= N; i++) {
            pow[i] = pow[i - 1] * 2;
            pow[i] %= MOD;
        }

        dp[0] = 1;

        for (int i = 1; i <= M; i++) {
            dp[i] = pow[i];
        }

        dp[M] -= 1;

        for (int i = M + 1; i <= N; i++) {
            dp[i] = dp[i - 1] + (dp[i - 1] - dp[i - 1 - M]);
            dp[i] %= MOD;
        }

        return (pow[N] - dp[N] + MOD) % MOD;
    }
}
```</s>
