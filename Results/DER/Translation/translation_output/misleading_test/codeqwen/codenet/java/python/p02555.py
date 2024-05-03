Here is the Python equivalent of the Java code:

```python
def main():
    n = int(input())
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

This Python code does the same thing as the Java code. It reads an integer from the user, calculates the number of ways to reach the given number using dynamic programming, and prints the result. The dynamic programming array `dp` is initialized with zeros and the first element is set to 1. Then, for each number `i` from 3 to `n`, it iterates over all numbers `j` from 3 to `i` and adds the number of ways to reach `i - j` to the number of ways to reach `i`. The result is then taken modulo `mod` to prevent overflow. Finally, the result for `n` is printed.
