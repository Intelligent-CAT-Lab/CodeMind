Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 3

Expected output:
2


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

### Response:
```python
import sys

MOD = 998244353

def pow(x, n):
    if n == 0:
        return 1
    y = pow(x, n // 2)
    if n % 2 == 0:
        return (y * y) % MOD
    else:
        return ((x * y) * y) % MOD

def main():
    N, X = map(int, input().split())
    dp = [[[0] * (X + 1) for _ in range(512)] for _ in range(2)]
    for i in range(X + 1):
        dp[0][i][i] = 1
    t = 1
    for i in range(1, N):
        for j in range(512):
            for k in range(X + 1):
                dp[t][j][k] = 0
                for l in range(X + 1):
                    dp[t][j][k] += dp[1 - t][j][l] * pow(2, X - l)
                    dp[t][j][k] %= MOD
        t = 1 - t
    ans = 0
    for i in range(X + 1):
        ans += dp[1 - t][X][i]
    print(ans % MOD)

if __name__ == '__main__':
    main()
```<|endoftext|>
