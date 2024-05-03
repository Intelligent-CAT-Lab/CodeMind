Here is the Python version of the provided Java code:

```python
import sys

MOD = 998244353

def solve(test_number, inp, out):
    str_ = inp.readline().strip()
    k = int(inp.readline())
    a = []
    n = 0
    for i in range(len(str_) - 1, -1, -1):
        if str_[i] == '0':
            a.append(n)
            n = 0
        else:
            n += 1
    a.append(n)
    n = len(a)
    ones = n - 1
    zeros = len(str_) - ones
    if ones == 0 or zeros == 0:
        out.write('1\n')
        return
    dp = [[[0 for _ in range(zeros + 1)] for _ in range(zeros + 1)] for _ in range(n + 1)]
    dp[0][0][0] = 1
    for i in range(n):
        sum0 = [[0 for _ in range(zeros + 1)] for _ in range(zeros + 1)]
        sum1 = [[0 for _ in range(zeros + 1)] for _ in range(zeros + 1)]
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
            dp[i + 1][total]
