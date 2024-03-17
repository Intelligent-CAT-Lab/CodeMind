Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 3

Expected output:
3


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

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int MOD = 1000000007;
        int[] pow = new int[N + 1];
        int[] dp = new int[N + 1];
        pow[0] = 1;
        for (int i = 1; i <= N; i++) {
            pow[i] = pow[i - 1] * 2 % MOD;
        }
        dp[0] = 1;
        for (int i = 1; i <= M; i++) {
            dp[i] = pow[i];
        }
        dp[M]--;
        for (int i = M + 1; i <= N; i++) {
            dp[i] = (dp[i - 1] + (dp[i - 1] - dp[i - 1 - M]) + MOD) % MOD;
        }
        System.out.println((pow[N] - dp[N] + MOD) % MOD);
    }
}
```<|endoftext|>
