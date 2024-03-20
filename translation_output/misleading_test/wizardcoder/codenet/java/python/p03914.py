Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 3

Expected output:
-72

```
import java.util.Scanner;

public class p03914 {
	public static long MOD = 1000000007;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		long[][] dp = new long[n+1][n+1];
		dp[1][0] = 1;
		for(int i=0;i<m;i++) {
			long[][] next = new long[n+1][n+1];
			for(int a=0;a<=n;a++) {
				for(int b=0;b<=n;b++) {
					if (dp[a][b] == 0) continue;
					next[a+b][0] = (next[a+b][0] + dp[a][b] * a) % MOD;
					next[a][b+1] = (next[a][b+1] + dp[a][b] * (n-a-b)) % MOD;
					next[a][b] = (next[a][b] + dp[a][b] * b) % MOD;
				}
			}
			dp = next;
		}
		System.out.println(dp[n][0]);
	}

}

```

### Response:
```python
MOD = 1000000007

def solve(n, m):
    dp = [[0]*(n+1) for _ in range(n+1)]
    dp[1][0] = 1
    for i in range(m):
        next = [[0]*(n+1) for _ in range(n+1)]
        for a in range(n+1):
            for b in range(n+1):
                if dp[a][b] == 0:
                    continue
                next[a+b][0] = (next[a+b][0] + dp[a][b] * a) % MOD
                next[a][b+1] = (next[a][b+1] + dp[a][b] * (n-a-b)) % MOD
                next[a][b] = (next[a][b] + dp[a][b] * b) % MOD
        dp = next
    return dp[n][0]

n, m = map(int, input().split())
print(solve(n, m))
```

Explanation:

We first define a constant `MOD` to be used for modular arithmetic.

We then define a function `solve` that takes in two integers `n` and `m` and returns the answer to the problem.

We initialize a 2D list `dp` of size `(n+1) x (n+1)` to store the values of the dynamic programming table. We initialize the first row and column of `dp` to 0, and the first element of the second row to 1.

We then iterate `m` times, and for each iteration, we create a new 2D list `next` of the same size as `dp` to store the values of the next iteration of the dynamic programming table.

We then iterate over all possible values of `a` and `b` in `dp`, and if the value of `dp[a][b]` is not 0, we update the values of `next[a+b][0]`, `next[a][b+1]`, and `next[a][b]` based on the recurrence relation of the problem.

Finally, we return the value of `dp[n][0]` as the answer to the problem.<|endoftext|>
