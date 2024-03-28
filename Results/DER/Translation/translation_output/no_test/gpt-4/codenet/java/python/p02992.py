The provided Java code appears to be part of a problem solution that reads input data, performs dynamic programming calculations, and outputs a result. Here is the equivalent Python code for the main logic:

```python
import math
import sys

MOD = 1000000007

def main():
    N, K = map(int, input().split())
    sqrt = int(math.floor(math.sqrt(N)))
    sqrt = 2 * sqrt - 1 if sqrt * (sqrt + 1) > N else 2 * sqrt
    dp = [[0] * sqrt for _ in range(K)]
    
    for i in range(sqrt):
        dp[0][i] = max(1, N // (sqrt - i) - N // (sqrt - i + 1))
    
    for i in range(1, K):
        sum_dp = 0
        for j in range(sqrt - 1, -1, -1):
            sum_dp = (sum_dp + dp[i - 1][sqrt - j - 1]) % MOD
            dp[i][j] = sum_dp * max(1, N // (sqrt - j) - N // (sqrt - j + 1)) % MOD
    
    ans = sum(dp[K - 1][i] for i in range(sqrt)) % MOD
    print(ans)

if __name__ == "__main__":
    main()
```

This Python script assumes that input values for `N` and `K` are provided in the same way as in the Java program, i.e., through standard input. It performs the main dynamic programming loop and prints out the final answer to standard output.

Please note that handling tasks such as input parsing and output formatting in Python is typically more straightforward than in Java due to Python's built-in functions such as `map()` and `print()`, and not needing to manually manage a print buffer with `flush()`.

Also note that the utility classes and enums, `FastIO`, `BoundType`, `Range`, `IterableFunction`, `IterableRange`, and `IntRange` are omitted because Python's standard library provides similar functionality out of the box. The provided Python code only focuses on the core logic of the solution. If the problem relies on a custom input/output handling that handles large data efficiently or specific properties of the data structures mentioned, you would need to implement the corresponding parts tailored to the requirements.
