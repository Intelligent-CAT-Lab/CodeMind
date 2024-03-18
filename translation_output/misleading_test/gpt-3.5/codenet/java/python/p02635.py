```python
import sys

def solve():
    str_input, k = input().split()
    str_input = str_input.strip()
    k = int(k)

    a = []
    rlc = []
    count = 0
    for i in range(len(str_input) - 1, -1, -1):
        if str_input[i] == '0':
            rlc.append(count)
            count = 0
        else:
            count += 1
    rlc.append(count)
    
    n = len(rlc)
    a = [rlc[i] for i in range(n)]

    ones = n - 1
    zeros = len(str_input) - ones

    if ones == 0 or zeros == 0:
        print(1)
        return

    MOD = 998244353
    dp = [[[0 for _ in range(zeros + 1)] for _ in range(zeros + 1)] for _ in range(n + 1]
    sum0 = [[0 for _ in range(zeros + 1)] for _ in range(zeros + 1)]
    sum1 = [[0 for _ in range(zeros + 1)] for _ in range(zeros + 1)]

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
            dp[i + 1][total] = dp[i][total]

        for total in range(zeros + 1):
            for now in range(total + 1):
                dp[i + 1][total][now] += (sum0[total][total] - sum0[total][now] + MOD)
                dp[i + 1][total][now] %= MOD

        for total in range(1, zeros + 1):
            for now in range(1, total + 1):
                mini = min(total, min(now, a[i]))
                for take in range(1, mini + 1):
                    dp[i + 1][total][now] += dp[i][total - take][now - take]
                dp[i + 1][total][now] %= MOD

    ans = 0
    ans = sum(dp[n][i][0] for i in range(min(k, zeros) + 1)) % MOD
    print(ans)

if __name__ == "__main__":
    solve()
```
```
