def solve(S):
    d = list(S)
    dp = [1] + [0] * 12
    base = 1
    MOD = 1000000007
    
    for i in range(len(d)-1, -1, -1):
        next_dp = [0] * 13
        if d[i] == '?':
            for k in range(10):
                for j in range(13):
                    next_dp[(k * base + j) % 13] += dp[j]
                    next_dp[(k * base + j) % 13] %= MOD
        else:
            k = int(d[i])
            for j in range(13):
                next_dp[(k * base + j) % 13] += dp[j]
                next_dp[(k * base + j) % 13] %= MOD
        dp = next_dp
        base = base * 10 % 13

    print(dp[5])

def main():
    S = input()
    solve(S)

if __name__ == "__main__":
    main()