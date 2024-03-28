<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3

Expected output:
15

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

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long MOD = (long) Math.pow(10, 9) + 7;
        long[][] dp = new long[61][3];
        dp[60][0] = 1;
        for (int i = 59; i >= 0; i--) {
            if ((n >> i & 1) == 1) {
                dp[i][0] += dp[i + 1][0];
                dp[i][1] += dp[i + 1][0] + dp[i + 1][1];
                dp[i][2] += 2 * dp[i + 1][1] + 3 * dp[i + 1][2];
            } else {
                dp[i][0] += dp[i + 1][0] + dp[i + 1][1];
                dp[i][1] += dp[i + 1][1];
                dp[i][2] += dp[i + 1][1] + 3 * dp[i + 1][2];
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

This Java code does the same thing as the Python code. It reads an integer from the standard input, initializes a 2D array `dp`, and then fills it in a similar way to the Python code. Finally, it calculates the sum of the elements in the first row of `dp` and prints the result modulo `MOD`.<｜end▁of▁sentence｜>
