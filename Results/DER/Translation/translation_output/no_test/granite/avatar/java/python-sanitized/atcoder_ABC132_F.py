import sys

MOD = 10**9 + 7

def main():
    N, K = map(int, input().split())
    l = 1
    lens = []
    while l <= N:
        r = N // (N // l)
        lens.append(r - l + 1)
        l = r + 1
    q = len(lens)
    dp = [0] * (K * (q + 1))
    for j in range(1, q + 1):
        dp[j] = lens[j - 1] + dp[j - 1]
    for i in range(1, K):
        for j in range(1, q + 1):
            dp[i * (q + 1) + j] = (dp[i * (q + 1) + j - 1] + dp[(i - 1) * (q + 1) + q - j + 1] * lens[j - 1]) % MOD
    print(dp[K * (q + 1) - 1])

if __name__ == '__main__':
    main()