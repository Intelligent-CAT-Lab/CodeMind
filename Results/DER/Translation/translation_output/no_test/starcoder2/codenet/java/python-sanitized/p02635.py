import sys

MOD = 998244353

def main():
    str = sys.stdin.readline().strip()
    k = int(sys.stdin.readline())
    a = []
    n = 0
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
        print(1)
        return

    dp = [[[0] * (zeros + 1) for _ in range(zeros + 1)] for _ in range(n + 1)]
    sum0 = [[0] * (zeros + 1) for _ in range(zeros + 1)]
    sum1 = [[0] * (zeros + 1) for _ in range(zeros + 1)]
    dp[0][0][0] = 1
    for i in range(n):
        # sum0
        for total in range(zeros + 1):
            sum0[total][0] = dp[i][total][0]
            for now in range(1, zeros + 1):
                sum0[total