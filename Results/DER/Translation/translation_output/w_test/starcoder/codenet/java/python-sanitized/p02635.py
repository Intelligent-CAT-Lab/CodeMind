import sys

MOD = 998244353

class CShift:
    def __init__(self):
        self.dp = [[[0 for _ in range(1000001)] for _ in range(1000001)] for _ in range(1000001)]
        self.sum0 = [[0 for _ in range(1000001)] for _ in range(1000001)]
        self.sum1 = [[0 for _ in range(1000001)] for _ in range(1000001)]

    def solve(self, testNumber, in, out):
        str = in.chars()
        k = in.ints()
        n = len(str)
        ones = n - 1
        zeros = len(str) - ones
        if ones == 0 or zeros == 0:
            out.ans(1).ln()
            return

        for i in range(n):
            self.dp[i + 1][0][0] = 1
            for total in range(zeros + 1):
                self.sum0[total][0] = self.dp[i][total][0]
                for now