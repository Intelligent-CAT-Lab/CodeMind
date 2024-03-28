<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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


Translate the above java code to python.

python code:

[/INST]
```python
import sys

MOD = 1000000007

def main():
    n, m = map(int, sys.stdin.readline().split())
    dp = [[0] * (n + 1) for _ in range(n + 1)]
    dp[1][0] = 1
    for _ in range(m):
        next_dp = [[0] * (n + 1) for _ in range(n + 1)]
        for a in range(n + 1):
            for b in range(n + 1):
                if dp[a][b] == 0:
                    continue
                next_dp[a + b][0] = (next_dp[a + b][0] + dp[a][b] * a) % MOD
                next_dp[a][b + 1] = (next_dp[a][b + 1] + dp[a][b] * (n - a - b)) % MOD
                next_dp[a][b] = (next_dp[a][b] + dp[a][b] * b) % MOD
        dp = next_dp
    print(dp[n][0])

if __name__ == "__main__":
    main()
```
This is the Python code equivalent to the given Java code. The main difference is that Python uses a list comprehension to create the `next_dp` array, which is more concise and easier to read than the Java code's nested for loops. Additionally, Python uses the `range` function to iterate over the indices of the arrays, which is more idiomatic than the Java code's `for` loops with explicit indices.</s>
