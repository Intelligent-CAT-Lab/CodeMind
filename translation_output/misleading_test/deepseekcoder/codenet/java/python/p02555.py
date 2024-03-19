<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
7

Expected output:
92

```
import java.util.*;

public class p02555 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long mod = 1000000007;
        long[] dp = new long[n + 1];
        dp[0] = 1;
        for (int i = 3; i <= n; i++) {
            for (int j = 3; j <= i; j++) {
                dp[i] = (dp[i] + dp[i - j]) % mod;
            }
        }
        System.out.println(dp[n]);
    }
}

```

### Response:
```python
import sys

def solve(n):
    mod = 1000000007
    dp = [0] * (n + 1)
    dp[0] = 1
    for i in range(3, n + 1):
        for j in range(3, i + 1):
            dp[i] = (dp[i] + dp[i - j]) % mod
    return dp[n]

n = int(sys.stdin.readline().strip())
print(solve(n))
```

This Python code does the same thing as the Java code. It reads an integer from standard input, calls the `solve` function with this integer as argument, and prints the result. The `solve` function calculates the number of ways to partition a number into sum of at least three parts, using dynamic programming. The result is calculated modulo 1,000,000,007 to prevent overflow.
<|EOT|>
