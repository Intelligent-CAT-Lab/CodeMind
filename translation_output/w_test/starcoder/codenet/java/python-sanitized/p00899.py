import sys

class AOJ1320:
    def __init__(self):
        self.sc = sys.stdin
        self.solve()

    def solve(self):
        while True:
            N = int(self.sc.readline())
            if N == 0:
                break
            self.N = N
            self.N2 = 0
            self.INF = 1 << 29
            self.str = []
            self.eq = []
            self.str2 = []
            self.len = []
            self.dp = []
            self.ans = self.INF
            self.tmp = 0
            self.init()
            self.solve2()
            print(self.ans)

    def init(self):
        for i in range(self.N):
            self.str.append(self.sc.readline().strip())
        for i in range(self.N):
            self.eq.append(False)
        for i in range(self.N):
            if self.eq[i]:
                continue
            for j in range(self.N):
                if i!= j and not self.eq[j] and self.str[i].find(self.str[j])!= -1:
                    self.eq[j] = True
        for i in range(self.N):
            if not self.eq[i]:
                self.str2.append(self.str[i])
        self.N2 = len(self.str2)
        for i in range(self.N2):
            for j in range(self.N2):
                if i == j:
                    continue
                offset = 0
                l = len(self.str2[i])
                for offset in range(l):
                    if self.str2[j].find(self.str2[i][offset:])!= -1:
                        break
                self.len.append(len(self.str2[j]) - (l - offset))
        for i in range(1 << self.N2):
            for j in range(self.N2):
                self.dp.append([self.INF] * self.N2)
        for i in range(self.N2):
            self.dp[1 << i][i] = len(self.str2[i])
        for i in range(1 << self.N2):
            for j in range(self.N2):
                if self.dp[i][j] >= self.INF:
                    continue
                for k in range(self.N2):
                    if (i & (1 << k)) > 0:
                        continue
                    newIdx = i | (1 << k)
                    self.dp[newIdx][k] = min(self.dp[newIdx][k], self.dp[i][j] + self.len[j * self.N2 + k])
        for i in range(1 << self.N2):
            for j in range(self.N2):
                if self.dp[i][j] >= self.INF:
                    continue
                self.tmp = i
                self.ans = min(self.ans, self.dp[self.tmp][j])

    def solve2(self):
        pass


if __name__ == '__main__':
    AOJ1320()