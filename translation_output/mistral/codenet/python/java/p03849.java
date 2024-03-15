<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
MOD = 10**9 + 7
n = int(input())
dp = [[0 for _ in range(3)] for _ in range(61)]
dp[60][0] = 1
for i in range(59, -1, -1):
	if (n>>i)&1 == 1:
		dp[i][0] += dp[i+1][0]
		dp[i][1] += dp[i+1][0] + dp[i+1][1]
		dp[i][2] += 2*dp[i+1][1] + 3*dp[i+1][2]
	else:
		dp[i][0] += dp[i+1][0] + dp[i+1][1]
		dp[i][1] += dp[i+1][1]
		dp[i][2] += dp[i+1][1] + 3*dp[i+1][2]
	for j in range(3):
		dp[i][j] %= MOD
print(sum(dp[0])%MOD)
```
[/INST]
```java
import java.util.*;

public class Main {
    final static int MOD = (int) (1e9 + 7);
    static int[][] dp = new int[61][3];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Arrays.fill(dp[0], 1);
        for (int i = 1; i < 60; i++) {
            if ((n >> i) & 1 == 1) {
                dp[i][0] = dp[i + 1][0] + dp[i + 1][1];
                dp[i][1] = dp[i + 1][0] + dp[i + 1][1] + dp[i + 1][2];
                dp[i][2] = 2 * dp[i + 1][1] + 3 * dp[i + 1][2];
            } else {
                dp[i][0] = dp[i + 1][0] + dp[i + 1][1];
                dp[i][1] = dp[i + 1][1];
                dp[i][2] = dp[i + 1][1] + 3 * dp[i + 1][2];
            }
            for (int j = 0; j < 3; j++) {
                dp[i][j] %= MOD;
            }
        }
        System.out.println(Arrays.stream(dp[0]).sum() % MOD);
    }
}
```</s>
