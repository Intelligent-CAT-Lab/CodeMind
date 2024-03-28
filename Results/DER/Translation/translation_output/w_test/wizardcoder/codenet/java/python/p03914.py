Below is an instruction that describes a task. Write a response that appropriately completes the request.

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

def countPaths(n, m):
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
print(countPaths(n, m))
```

Explanation:

We first define a constant `MOD` to be used for modular arithmetic.

We then define a function `countPaths` that takes in two integers `n` and `m` and returns the number of paths from the top left corner to the bottom right corner of an `n x n` grid using `m` moves.

We initialize a `dp` array of size `(n+1) x (n+1)` to store the number of paths from the top left corner to each cell of the grid. We set the value of `dp[1][0]` to 1 since there is only one way to get to the top left corner from the top left corner.

We then iterate `m` times, performing each move in turn. For each move, we create a new `next` array of size `(n+1) x (n+1)` to store the number of paths from the top left corner to each cell of the grid after the move. We then iterate over all cells of the grid and update the values of `next` accordingly.

We update the value of `next[a+b][0]` by adding the number of paths from the cell `(a, b)` to the top of the grid, multiplied by the number of paths from the cell `(a, b)` to the top left corner. We update the value of `next[a][b+1]` by adding the number of paths from the cell `(a, b)` to the right of the grid, multiplied by the number of paths from the cell `(a, b)` to the top right corner. We update the value of `next[a][b]` by adding the number of paths from the cell `(a, b)` to itself, multiplied by the number of paths from the cell `(a, b)` to the top left corner.

We then update the value of `dp` to be the new `next` array.

Finally, we return the value of `dp[n][0]` which represents the number of paths from the top left corner to the bottom right corner of the grid.<|endoftext|>
