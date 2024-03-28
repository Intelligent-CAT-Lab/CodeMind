import sys

MOD = 1000000007
inf = 1000000000

def solve():
    n = int(sys.stdin.readline())
    x = int(sys.stdin.readline())
    y = int(sys.stdin.readline())
    z = int(sys.stdin.readline())
    sum = x+y+z+1
    mask = 1<<sum
    mask -= 1
    dp = [[0]*(mask+1) for _ in range(n+1)]
    ng = 0
    ng |= 1<<z
    ng |= 1<<(y+z)
    ng |= 1<<(x+y+z)
    dp[0][1] = 1
    for i in range(n):
        for state in range(mask+1):
            for j in range(1, 11):
                res = ((state<<j)&mask) + 1
                if res&ng: continue
                dp[i+1][res] += dp[i][state]
                dp[i+1][res] %= MOD
    ans = 1
    for i in range(n):
        ans *= 10
        ans %= MOD
    for i in range(mask+1):
        ans -= dp[n][i]
        ans %= MOD
    print(ans)

if __name__ == '__main__':
    solve()