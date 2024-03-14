<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```:
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

python code:<fim_suffix><fim_middle>
```python
MOD = 998244353

def solve(N, X):
    dp = [[[0] * (X + 1) for _ in range(512)] for _ in range(2)]
    for i in range(X + 1):
        dp[0][i][i] = 1
    t = 1
    for i in range(1, N):
        t = 1 - t
        for j in range(512):
            for k in range(X + 1):
                dp[t][j][k] = 0
            for k in range(X + 1):
                sum = 0
                for l in range(X + 1):
                    sum += dp[1 - t][j][l]
                    dp[t][j ^ k][l] += sum
                    dp[t][j ^ k][l] %= MOD
    ans = 0
    for i in range(X + 1):
        ans += dp[1 - t][X][i]
    return ans % MOD

if __name__ == '__main__':
    N, X = map(int, input().split())
    print(solve(N, X))
```
<|endoftext|>
