Below is the translated code from Java to Python:

```python
def f(n):
    if n in memo:
        return memo[n]
    if n <= 2:
        return n
    res = f(n // 2) + f((n - 1) // 2) + f((n + 1) // 2)
    res %= MOD
    memo[n] = res
    return res

MOD = 10**9 + 7
memo = {}
n = int(input())
print(f(n + 1))
```

Just like in the Java version, the Python code is using memoization to optimize the recursive calculation of `f`. The key differences in the translation include using dictionary `memo` for memoization instead of `HashMap mb`, and using Python's dictionary `get` method to check for previously computed values. The division operator `/` is replaced with `//` for integer division, which behaves similarly to Java's division operator for integers.
