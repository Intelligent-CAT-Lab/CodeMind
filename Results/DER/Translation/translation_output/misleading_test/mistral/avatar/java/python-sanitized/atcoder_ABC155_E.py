import sys

def get_num(s):
    return int(s[0])

def get_diff(s):
    return 10 - get_num(s)

def get_dp(s, i, j):
    if i == 0:
        return [get_num(s), get_diff(s)]
    dp = [[sys.maxsize, sys.maxsize] for _ in range(2)]
    for k in range(10):
        tmp = get_num(s) + j
        tmp = k - tmp
        if tmp < 0:
            dp[1][i] = min(dp[1][i], dp[i+1][j] + tmp + 10 + k)
        else:
            dp[0][i] = min(dp[0][i], dp[i+1][j] + tmp + k)
    return dp

def main():
    s = input()
    c = list(s)
    N = len(c)
    dp = [[sys.maxsize, sys.maxsize] for _ in range(N+1)]
    dp[N][0] = get_num(c[0])
    dp[N][1] = 10 - get_num(c[0])

    for i in range(N-1, -1, -1):
        dp[i] = get_dp(c[i], i, 0)

    print(dp[0][0])

if __name__ == "__main__":
    main()