<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

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
[/INST]
```java
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int MOD = 1000000007;
        int[][] dp = new int[61][3];
        dp[60][0] = 1;
        for (int i = 59; i >= 0; i--) {
            if ((n >> i) & 1 == 1) {
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
        System.out.println(sum(dp[0]) % MOD);
    }

    private static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
```
This is the Java code for the given Python code. The code uses a 2D array `dp` to store the values of the recurrence relation, and the `MOD` variable is used to store the modulus value. The `sum` function is used to calculate the sum of the elements in the `dp` array. The `main` function takes the input `n` from the user, initializes the `dp` array, and then calculates the values of the recurrence relation using the `for` loop. Finally, the code prints the sum of the elements in the `dp` array modulo `MOD`.</s>
