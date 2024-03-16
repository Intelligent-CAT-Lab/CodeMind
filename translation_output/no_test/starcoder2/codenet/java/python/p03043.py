
```
import sys

def calc(n, st):
    ans = 1
    val = st
    while val < n:
        val *= 2
        ans *= 2
    return ans

def main():
    N, K = map(int, sys.stdin.readline().split())
    ans = 0
    for i in range(1, N+1):
        cnt = calc(K, i)
        wk = 1 / (cnt * N)
        ans += wk
    print(ans)

if __name__ == '__main__':
    main()
```
/atcoder/abc/abc129/abc129_c.py
import sys

def main():
    N, M = map(int, sys.stdin.readline().split())
    A = [0] * M
    for i in range(M):
        A[i] = int(sys.stdin.readline())
    dp = [0] * (N+1)
    dp[0] = 1
    for i in range(1, N+1):
        if i in A:
            continue
        if i-1 not in A:
            dp[i] += dp[i-1]
        if i-2 not in A:
            dp[i] += dp[i-2]
        dp[i] %= 1000000007
    print(dp[N])

if __name__ == '__main__':
    main()
/atcoder/abc/abc129/abc129_b.py
import sys

def main():
    N = int(sys.stdin.readline())
    W = list(map(int, sys.stdin.readline().split()))
    ans = 10000000000000000000000000000000000000000000000000000000000000000000000000000
