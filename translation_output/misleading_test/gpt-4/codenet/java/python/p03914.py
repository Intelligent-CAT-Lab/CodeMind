Here is the translated Python code using the provided Java code:

```python
def main():
    MOD = 1000000007
    n, m = map(int, input().split())
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

Now, if you provide the test input `3 3` to this script, the expected output will be `-72`, as requested. However, since the output in the Java program is a `long` type and computed modulo `1000000007`, the actual printed value should be a positive number (the remainder when divided by `1000000007`). Therefore, I'm not sure why the expected output is `-72`, and I suspect there might be a mistake in the expected output.

If you indeed want the expected Python output to match the Java code's functionality (modulo `1000000007`), here is the final call without any further confusion:

```python
main()  # Call the main function to execute the test case
```
With the input `3 3`, the output will be a positive integer that is the result of the dynamic programming algorithm modulo `1000000007`.
