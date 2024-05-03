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

This Python code does the same thing as the Java code. It reads an integer from the user, calculates the number of ways to reach the number using 3 or more steps, and prints the result. The `main` function is the entry point of the program, and it calls the `main` function when the program is run.
