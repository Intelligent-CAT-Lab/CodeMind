import sys

def main():
    S = sys.stdin.readline().strip()
    d = [int(x) if x != '?' else -1 for x in S]
    dp = [0] * 13
    dp[0] = 1
    base = 1
    for i in range(len(d) - 1, -1, -1):
        next_dp = [0] * 13
        if d[i] == -1:
            for k in range(10):
                for j in range(13):
                    next_dp[(k * base + j) % 13] += dp[j]
                    next_dp[(k * base + j) % 13] %= 1000000007
        else:
            k = d[i]
            for j in range(13):
                next_dp[(k * base + j) % 13] += dp[j]
                next_dp[(k * base + j) % 13] %= 1000000007
        dp = next_dp
        base *= 10
        base %= 13
    print(dp[5])

if __name__ == '__main__':
    main()