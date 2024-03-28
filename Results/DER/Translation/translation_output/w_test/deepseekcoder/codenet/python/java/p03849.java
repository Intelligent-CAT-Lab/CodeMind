<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3

Expected output:
5


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

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final long MOD = (long) Math.pow(10, 9) + 7;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[][] dp = new long[61][3];
        dp[60][0] = 1;
        for (int i = 59; i >= 0; i--) {
            if ((n & (1 << i)) != 0) {
                dp[i][0] += dp[i+1][0];
                dp[i][1] += dp[i+1][0] + dp[i+1][1];
                dp[i][2] += 2*dp[i+1][1] + 3*dp[i+1][2];
            } else {
                dp[i][0] += dp[i+1][0] + dp[i+1][1];
                dp[i][1] += dp[i+1][1];
                dp[i][2] += dp[i+1][1] + 3*dp[i+1][2];
            }
            for (int j = 0; j < 3; j++) {
                dp[i][j] %= MOD;
            }
        }
        long sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += dp[0][i];
        }
        System.out.println(sum % MOD);
    }
}
```

This Java code does the same thing as the Python code. It calculates the sum of all possible binary strings of length `n` that do not contain two consecutive 1s. The result is taken modulo `10^9 + 7` to prevent overflow.
<|EOT|>
