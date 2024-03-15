The following is the Python translation of the provided Java code:

```python
import sys

def exp(base, e, mod):
    if e == 0:
        return 1
    if e == 1:
        return base
    val = exp(base, e // 2, mod)
    ans = (val * val) % mod
    if e % 2 == 1:
        ans = (ans * base) % mod
    return ans

def main():
    s = input()
    n = len(s)
    abc = {"abc", "acb", "bac", "bca", "cab", "cba"}
    diff = 0
    for i in range(n - 1):
        if s[i] != s[i + 1]:
            diff += 1
            
    if n <= 2:
        if s[0] == s[1]:
            print(1)
        else:
            print(2)
    elif s in abc:
        print("3")
    elif diff == 0:
        print("1")
    else:
        mod = 998244353
        dp = [[[0 for _ in range(3)] for _ in range(3)] for _ in range(n)]
        dp_no_dpl = [[[0 for _ in range(3)] for _ in range(3)] for _ in range(n)]
        ans = 1
        for i in range(n - 1):
            if s[i] == s[i + 1]:
                ans = 0
        sum_digits = 0
        for i in range(n):
            sum_digits += (ord(s[i]) - ord('a'))
            sum_digits %= 3
        dp[0][0][0] = 1
        dp[0][1][1] = 1
        dp[0][2][2] = 1
        dp_no_dpl[0][0][0] = 1
        dp_no_dpl[0][1][1] = 1
        dp_no_dpl[0][2][2] = 1
        
        for i in range(1, n):
            for j in range(3):
                dp_no_dpl[i][0][j] += dp_no_dpl[i - 1][1][(j + 3 - 0) % 3]
                dp_no_dpl[i][0][j] += dp_no_dpl[i - 1][2][(j + 3 - 0) % 3]
                dp_no_dpl[i][1][j] += dp_no_dpl[i - 1][0][(j + 3 - 1) % 3]
                dp_no_dpl[i][1][j] += dp_no_dpl[i - 1][2][(j + 3 - 1) % 3]
                dp_no_dpl[i][2][j] += dp_no_dpl[i - 1][0][(j + 3 - 2) % 3]
                dp_no_dpl[i][2][j] += dp_no_dpl[i - 1][1][(j + 3 - 2) % 3]

                for k in range(3):
                    dp_no_dpl[i][k][j] %= mod

        ans += exp(3, n - 1, mod) + mod
        ans += 3 * mod - dp_no_dpl[n - 1][0][sum_digits] - dp_no_dpl[n - 1][1][sum_digits] - dp_no_dpl[n - 1][2][sum_digits]
        ans %= mod
        print(ans)

if __name__ == '__main__':
    main()
```

Note that this translation keeps the main structure and logic of the original Java code, but there are Python-specific changes:
- The `exp` function and the `main` function are defined as standalone Python functions instead of being static methods inside a class.
- The input and output are handled using the `input()` and `print()` functions respectively.
- The syntax for lists (used for dynamic programming table `dp` and `dp_no_dpl`) is updated to Python conventions.
- The loops and indexing follow Python's `range` function and zero-based indexing.
- The module `sys` is imported for consistency with the original code's intent to use standard I/O, but the `sys.exit(0)` call is omitted (unnecessary in the translated Python code).
- The arithmetic operations follow Python conventions, and integer division is changed to `//` instead of `/`.
- The code comments related to unused parts of the Java code are removed from the translation.
- Character-to-integer conversion uses `ord()` instead of direct Java-style character arithmetic.

Make sure to run this code in an environment where Python's input and output use the console, or adjust the I/O handling if a different setup is required.
