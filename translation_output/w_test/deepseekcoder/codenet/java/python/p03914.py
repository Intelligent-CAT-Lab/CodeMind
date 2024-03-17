<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 3

Expected output:
2


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
    dp = {(1, 0): 1}
    for _ in range(m):
        next = {(a+b, 0): (next.get((a+b, 0), 0) + dp.get((a, b), 0) * a) % MOD 
                for a in range(n+1) for b in range(n+1)}
        next.update({(a, b+1): (next.get((a, b+1), 0) + dp.get((a, b), 0) * (n-a-b)) % MOD 
                     for a in range(n+1) for b in range(n+1)})
        next.update({(a, b): (next.get((a, b), 0) + dp.get((a, b), 0) * b) % MOD 
                     for a in range(n+1) for b in range(n+1)})
        dp = next
    return dp[(n, 0)]

n, m = map(int, input().split())
print(solve(n, m))
```

This Python code does the same thing as the Java code. It reads two integers `n` and `m` from the input, and then calculates the result using the `solve` function. The `solve` function uses a dictionary `dp` to store the intermediate results, and uses nested dictionary comprehensions to update the `dp` dictionary. The final result is then printed to the output.
<|EOT|>
