<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 3

Expected output:
101

```
import java.util.Arrays;
import java.util.Scanner;

public class p02215 {
	static Scanner sc = new Scanner(System.in);
	static final long MOD = 998244353;

	public static void main(String[] args) {
		int N = sc.nextInt();
		int X = sc.nextInt();
		long[][][] dp = new long[2][512][X + 1];
		for (int i = 0; i <= X; i++) {
			dp[0][i][i] = 1;
		}
		int t = 1;
		for (int i = 1; i < N; i++, t = 1 - t) {
			for (int j = 0; j < 512; j++) {
				Arrays.fill(dp[t][j], 0);
			}
			for (int j = 0; j < 512; j++) {
				long sum = 0;
				for (int k = 0; k <= X; k++) {
					sum += dp[1 - t][j][k];
					dp[t][j ^ k][k] += sum;
					dp[t][j ^ k][k] %= MOD;
				}
			}
		}
		long ans = 0;
		for (int i = 0; i <= X; i++) {
			ans += dp[1 - t][X][i];
		}
		System.out.println(ans % MOD);
	}
}


```
[/INST]
```python
import sys

def main():
    N, X = map(int, input().split())
    dp = [[[0] * (X + 1) for _ in range(512)] for _ in range(2)]
    for i in range(X + 1):
        dp[0][i][i] = 1
    t = 1
    for i in range(1, N):
        for j in range(512):
            dp[t][j] = [0] * (X + 1)
        for j in range(512):
            sum = 0
            for k in range(X + 1):
                sum += dp[1 - t][j][k]
                dp[t][j ^ k][k] += sum
                dp[t][j ^ k][k] %= 998244353
        t = 1 - t
    ans = 0
    for i in range(X + 1):
        ans += dp[1 - t][X][i]
    print(ans % 998244353)

if __name__ == "__main__":
    main()
```
Note: The code is written in Python 3.x and uses the `input()` function to read the input from the user. The `map()` function is used to convert the input string to a list of integers. The `range()` function is used to iterate over the indices of the arrays. The `^` operator is used to perform bitwise XOR operations. The `%` operator is used to perform modulo operations. The `sys.stdin.readline()` function is used to read a line of input from the user.</s>
