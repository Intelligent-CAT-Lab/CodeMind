<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
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
public class Main {
    static final long MOD = (long) Math.pow(10, 9) + 7;
    static long[][] dp = new long[61][3];

    public static void main(String[] args) {
        int n = new java.util.Scanner(System.in).nextInt();
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

This Java code does the same thing as the Python code. It calculates the number of ways to represent a number as a sum of powers of 2, modulo `MOD`. The `dp` array is used to store the intermediate results, and the `main` function reads the input number and performs the calculations. The `sum` variable is used to calculate the sum of the elements in the `dp` array.<｜end▁of▁sentence｜>
