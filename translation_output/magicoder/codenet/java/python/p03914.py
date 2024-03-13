<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
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

@@ Response
```python
import sys

MOD = 1000000007

def main():
    n, m = map(int, sys.stdin.readline().split())
    dp = [[0] * (n + 1) for _ in range(n + 1)]
    dp[1][0] = 1
    for _ in range(m):
        next = [[0] * (n + 1) for _ in range(n + 1)]
        for a in range(n + 1):
            for b in range(n + 1):
                if dp[a][b] == 0:
                    continue
                next[a + b][0] = (next[a + b][0] + dp[a][b] * a) % MOD
                next[a][b + 1] = (next[a][b + 1] + dp[a][b] * (n - a - b)) % MOD
                next[a][b] = (next[a][b] + dp[a][b] * b) % MOD
        dp = next
    print(dp[n][0])

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers `n` and `m` from the standard input, initializes a 2D array `dp` with `n+1` rows and `n+1` columns, and then performs `m` iterations. In each iteration, it creates a new 2D array `next` and fills it with the values from `dp`. After that, `dp` is updated with the values from `next`. Finally, it prints the value at `dp[n][0]`.<｜end▁of▁sentence｜>
