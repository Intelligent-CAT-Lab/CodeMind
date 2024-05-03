Here is the Python equivalent of the Java code:

```python
import sys

def main():
    n = int(sys.stdin.readline())
    mod = 1000000007
    dp = [0] * (n + 1)
    dp[0] = 1
    for i in range(3, n + 1):
        for j in range(3, i + 1):
            dp[i] = (dp[i] + dp[i - j]) % mod
    print(dp[n])

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, calculates the number of ways to reach the nth step using 3 steps at a time, and prints the result. The `sys.stdin.readline()` function is used to read the input, and the `% mod` operation is used to keep the result within the range of a 64-bit integer. The `if __name__ == "__main__":` block is used to call the `main()` function when the script is run directly.
