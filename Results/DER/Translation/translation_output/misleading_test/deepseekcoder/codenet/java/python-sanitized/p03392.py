import sys
import re
from collections import defaultdict

def exp(base, e, mod):
    if e == 0:
        return 1
    if e == 1:
        return base
    val = exp(base, e//2, mod)
    ans = (val * val) % mod
    if e % 2 == 1:
        ans = (ans * base) % mod
    return ans

def solve(s):
    n = len(s)
    abc = {"abc", "acb", "bac", "bca", "cab", "cba"}
    diff = 0
    for i in range(n-1):
        if s[i] != s[i+1]:
            diff += 1

    if n <= 2:
        if s[0] == s[1]:
            return 1
        else:
            return 2
    elif s in abc:
        return 3
    elif diff == 0:
        return 1
    else:
        mod = 998244353
        dp = [[[0]*3 for _ in range(3)] for _ in range(n)]
        dp_no_dpl = [[[0]*3 for _ in range(3)] for _ in range(n)]
        ans = 1
        for i in range(n-1):
            if s[i] == s[i+1]:
                ans = 0

        sum = 0
        for i in range(n):
            sum += (ord(s[i])-ord('a'))
            sum %= 3

        dp[0][0][0] = 1
        dp[0][1][1] = 1
        dp[0][2][2] = 1
        dp_no_dpl[0][0][0] = 1
        dp_no_dpl[0][1][1] = 1
        dp_no_dpl[0][2][2] = 1
        for i in range(1, n):
            for j in range(3):
                dp_no_dpl[i][0][j] += dp_no_dpl[i-1][1][(j+3-0)%3]
                dp_no_dpl[i][0][j] += dp_no_dpl[i-1][2][(j+3-0)%3]
                dp_no_dpl[i][1][j] += dp_no_dpl[i-1][0][(j+3-1)%3]
                dp_no_dpl[i][1][j] += dp_no_dpl[i-1][2][(j+3-1)%3]
                dp_no_dpl[i][2][j] += dp_no_dpl[i-1][0][(j+3-2)