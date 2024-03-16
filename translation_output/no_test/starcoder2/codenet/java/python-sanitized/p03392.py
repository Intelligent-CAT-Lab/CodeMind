import sys

def exp(base, e, mod):
    if e == 0:
        return 1
    if e == 1:
        return base
    val = exp(base, e//2, mod)
    ans = (val*val) % mod
    if e % 2 == 1:
        ans = (ans*base) % mod
    return ans

s = input()
n = len(s)
abc = set(['abc', 'acb', 'bac', 'bca', 'cab', 'cba'])
diff = 0
for i in range(n-1):
    if s[i] != s[i+1]:
        diff += 1
if n <= 2:
    if s[0] == s[1]:
        print(1)
    else:
        print(2)
elif s in abc:
    print(3)
elif diff == 0:
    print(1)
else:
    mod = 998244353
    dp = [[[0 for _ in range(3)] for _ in range(3)] for _ in range(n)]
    dp_no_dpl = [[[0 for _ in range(3)] for _ in range(3)] for _ in range(n)]
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
            dp_no_dpl[i][2][j] += dp_no_dpl[i-1][0][(j+3-2)%3]
            dp_no_dpl[i][2][j] += dp_no_dpl[i-1][1][(j+3-2)%3]

            for k in range(3):
                dp_no_dpl[i][k][j] %= mod

    ans = exp(3, n-1, mod) + mod
    ans += 1*3*mod - dp_no_dpl[n-1][0][sum(s)] - dp_no_dpl[n-1][1][sum(s)] - dp_no_dpl[n-1][2][sum(s)]
    ans %= mod
    print(ans)