import sys
input = sys.stdin.readline

MOD = 10**8+7

def main():
    N, X, Y, Z = map(int, input().split())
    mask = (1 << (X + Y + Z + 1)) - 1
    ng = 1 << Z | 1 << (Y + Z) | 1 << (X + Y + Z)
    dp = [0] * (mask + 1)
    dp[1] = 1
    for _ in range(N):
        for i in range(mask, 0, -1):
            if dp[i] == 0:
                continue
            for j in range(1, 11):
                ni = ((i << j) & mask) + 1
                if (ni & ng) == ng:
                    continue
                dp[ni] += dp[i]
                dp[ni] %= MOD
    ans = pow(10, N, MOD)
    for i in range(mask + 1):
        ans -= dp[i]
        ans %= MOD
    print(ans)

if __name__ == '__main__':
    main()