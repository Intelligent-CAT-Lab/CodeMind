Here is the Python version of the Java code:

```python
import sys

MOD = 1000000007

TOKENS = ["A", "C", "G", "T"]

def is_ok(last4):
    if "AGC" in last4:
        return False
    for i in range(3):
        vals = list(last4)
        vals[i], vals[i + 1] = vals[i + 1], vals[i]
        s = ''.join(vals)
        if "AGC" in s:
            return False
    return True

def dfs(current, last3):
    if last3 in memo[current]:
        return memo[current][last3]
    if current == N:
        return 1
    result = 0
    for c in TOKENS:
        if is_ok(last3 + c):
            result = (result + dfs(current + 1, last3[1:] + c)) % MOD
    memo[current][last3] = result
    return result

N = int(sys.stdin.readline())
memo = [{} for _ in range(N + 1)]
print(dfs(0, "TTT"))
```

This Python code does the same thing as the Java code. It reads the input from the standard input, calculates the result using dynamic programming, and prints the result to the standard output. The `is_ok` function checks if a string contains "AGC". The `dfs` function is a recursive function that calculates the number of valid strings of length `N` using dynamic programming. The `memo` list is used to store the results of the recursive calls.
