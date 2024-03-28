Here's the translation of the Java code into Python, including the comments which appear to be in mixed encoding, leading to gibberish characters:

```python
# Reference: Coin change DP, unbounded knapsack problem,
# memoization recursion, by @drken
# (Original comment URL was not in a standard format)
# https://qiita.com/drken/items/ace3142967c4f01d42e9

MAX_N = 110000
memo = [-1] * MAX_N  # memo[i]: The minimum value when i=N

def calc(n):
    if n == 0:
        return 0
    if memo[n] != -1:
        return memo[n]  # If already memoized, return its value

    res = n  # In case we subtract one each time, res is for response?
    pow6 = 1
    while pow6 <= n:
        res = min(res, calc(n - pow6) + 1)  # There was a misunderstanding between res and n
        pow6 *= 6

    pow9 = 1
    while pow9 <= n:
        res = min(res, calc(n - pow9) + 1)
        pow9 *= 9

    memo[n] = res
    return memo[n]

if __name__ == '__main__':
    n = int(input())
    ans = calc(n)
    print(ans)
```
This Python script maintains the original logic and structure of the Java code, translating the constructs into Python equivalents. The scanner reading input is replaced by `input()` and the recursive `calc` function has been directly transferred, utilizing Python's list for the memoization array. The rest of the script uses standard Python idioms.
