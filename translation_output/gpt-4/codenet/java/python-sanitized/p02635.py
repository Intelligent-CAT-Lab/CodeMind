import sys
from typing import List

MOD = 998244353

def main():
    # Assuming 'solve' will read from standard input and write to standard output
    str_ = sys.stdin.readline().strip()
    k = int(sys.stdin.readline().strip())
    solve(str_, k)

def solve(str_, k):
    rlc = []
    count = 0
    for i in range(len(str_) - 1, -1, -1):
        if str_[i] == '0':
            rlc.append(count)
            count = 0
        else:
            count += 1
    rlc.append(count)
    n = len(rlc)
    a = rlc.copy()
    ones = n - 1
    zeros = len(str_) - ones
    if ones == 0 or zeros == 0:
        print(1)
        return
    
    dp = [[[0 for _ in range(zeros + 1)] for _ in range(zeros + 1)] for _ in range(n + 1)]
    sum0 = [[0 for _ in range(zeros + 1)] for _ in range(zeros + 1)]
    sum1 = [[0 for _ in range(zeros + 1)] for _ in range(zeros + 1)]
    dp[0][0][0] = 1
    for i in range(n):
        # sum0
        for total in range(zeros + 1):
            sum0[total][0] = dp[i][total][0]
            for now in range(1, zeros + 1):
                sum0[total][now] = (sum0[total][now - 1] + dp[i][total][now]) % MOD

        # sum1
        for total in range(zeros + 1):
            for now in range(zeros + 1):
                sum1[total][now] = dp[i][total][now]
                if total > 0 and now > 0:
                    sum1[total][now] += sum1[total - 1][now - 1]
                    sum1[total][now] %= MOD

        # thru
        for total in range(zeros + 1):
            dp[i + 1][total][:] = dp[i][total][:]

        # put
        for total in range(zeros + 1):
            for now in range(total + 1):
                dp[i + 1][total][now] += (sum0[total][total] - sum0[total][now] + MOD) % MOD

        # take
        for total in range(1, zeros + 1):
            for now in range(1, total + 1):
                min_take = min(total, min(now, a[i]))
                for take in range(1, min_take + 1):
                    dp[i + 1][total][now] += dp[i][total - take][now - take]
                dp[i + 1][total][now] %= MOD

    ans = 0
    for i in range(min(k, zeros) + 1):
        ans += dp[n][i][0]
    print(ans % MOD)

if __name__ == "__main__":
    main()