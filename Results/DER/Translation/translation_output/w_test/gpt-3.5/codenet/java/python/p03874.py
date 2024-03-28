```python
def solve():
    print(solve_long(nl()))

def solve_long(k):
    m = len("FESTIVAL")

    n = 600
    l = m - 1
    dp = [[0] * (l + 1) for _ in range(n + 1)]
    for i in range(n):
        dp[i][0] = 1
        for j in range(l):
            for p in range(i + 1):
                for q in range(j + 1):
                    dp[i + 1][j + 1] += dp[p][q]

    a = [0] * (n + 1)
    for i in range(n, 0, -1):
        a[i] = k // dp[i][l]
        k -= a[i] * dp[i][l]

    sb = ""
    for i in range(1, n + 1):
        sb += "FESTIVA"
        sb += "L" * a[i]

    return sb

def check(s):
    t = "FESTIVAL"
    m = len(t)
    map = {t[i]: i for i in range(m)}

    n = len(s)
    a = [map[s[i]] for i in range(n)]

    dp = [[0] * (m + 1) for _ in range(n + 1)]
    dp[0][0] = 1
    for i in range(n):
        for j in range(m + 1):
            dp[i + 1][j] = dp[i][j]
        dp[i + 1][a[i] + 1] += dp[i][a[i]]

    return dp[n][m]


# Sample code to read input, you may need to adjust this based on the desired input method
# def nl():
#     return int(input())

n = int(input())
solve()
```

This is the Java code translated to Python. The functions `solve` and `solve_long` correspond to the original methods in the Java code. The provided test case at the end will read an integer input and call the `solve` function accordingly.
