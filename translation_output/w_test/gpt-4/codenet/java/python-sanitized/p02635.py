MOD = 998244353

def cshift(str, k):
    a = []
    count = 0
    for i in range(len(str) - 1, -1, -1):
        if str[i] == '0':
            a.append(count)
            count = 0
        else:
            count += 1
    a.append(count)
    n = len(a)

    ones = n - 1
    zeros = len(str) - ones
    if ones == 0 or zeros == 0:
        return 1

    dp = [[[0] * (zeros + 1) for _ in range(zeros + 1)] for __ in range(n + 1)]
    sum0 = [[0] * (zeros + 1) for _ in range(zeros + 1)]
    sum1 = [[0] * (zeros + 1) for _ in range(zeros + 1)]
    dp[0][0][0] = 1

    for i in range(n):
        for total in range(zeros + 1):
            sum0[total][0] = dp[i][total][0]
            for now in range(1, zeros + 1):
                sum0[total][now] = (sum0[total][now - 1] + dp[i][total][now]) % MOD
        for total in range(zeros + 1):
            for now in range(zeros + 1):
                sum1[total][now] = dp[i][total][now]
                if total > 0 and now > 0:
                    sum1[total][now] += sum1[total - 1][now - 1]
                    sum1[total][now] %= MOD
        for total in range(zeros + 1):
            dp[i + 1][total][:] = dp[i][total][:]
        for total in range(zeros + 1):
            for now in range(total + 1):
                dp[i + 1][total][now] += (sum0[total][total] - sum0[total][now] + MOD)
                dp[i + 1][total][now] %= MOD
        for total in range(1, zeros + 1):
            for now in range(1, total + 1):
                min_take = min(total, min(now, a[i]))
                for take in range(1, min_take + 1):
                    dp[i + 1][total][now] += dp[i][total - take][now - take]
                dp[i + 1][total][now] %= MOD

    ans = 0
    for i in range(min(k, zeros) + 1):
        ans += dp[n][i][0]
    return ans % MOD

# Sample test case
print(cshift("0101", 1))  # Expected output: 4