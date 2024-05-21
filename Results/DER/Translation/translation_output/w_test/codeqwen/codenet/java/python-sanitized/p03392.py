import sys

def exp(base, e, mod):
    if e == 0: return 1
    if e == 1: return base
    val = exp(base, e//2, mod)
    ans = (val*val) % mod
    if e % 2 == 1:
        ans = (ans*base) % mod
    return ans

def main():
    s = sys.stdin.readline().strip()
    n = len(s)
    abc = {"abc", "acb", "bac", "bca", "cab", "cba"}
    diff = 0
    for i in range(n-1):
        if s[i] != s[i+1]: diff += 1
    if n <= 2:
        if s[0] == s[1]: print(1)
        else: print(2)
    elif s in abc: print(3)
    elif diff == 0:
        print(1)
    else:
        mod = 998244353
        dp = [[[0]*3 for _ in range(3)] for _ in range(n)]
        dp_no_dpl = [[[0]*3 for _ in range(3)] for _ in range(n)]
        ans = 1
        for i in range(n-1):
            if s[i] == s[i+1]: ans = 0
        sum = 0
        for i in range(n):
            sum += (ord(s[i]) - ord('a'))
            sum %= 3
        dp[0][0][0] = 1
        dp[0][1][1] = 1
        dp[0][2][2] = 1
        dp_no_dpl[0][0][0] = 1
        dp_no_dpl[0][1][1] = 1
        dp_no_dpl[0][2][2] = 1
        for i in range(1, n):
            for j in range(3):
                dp_no_dpl[i][0][j]