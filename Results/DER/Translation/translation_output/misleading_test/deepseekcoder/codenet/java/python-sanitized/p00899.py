import sys
from threading import Thread, currentThread
import re

class p00899:
    def __init__(self):
        self.sc = sys.stdin
        self.init()

    def init(self):
        stack_size = 8 * 1024 * 1024
        Thread(target=self.AOJ1320, name="RUN", args=()).start()

    def AOJ1320(self):
        while self.sc.hasNext():
            self.N = int(self.sc.readline())
            if self.N == 0:
                break
            self.solve()

    def solve(self):
        self.str = [self.sc.readline().strip() for _ in range(self.N)]
        self.eq = [False] * self.N
        for i in range(self.N):
            if self.eq[i]:
                continue
            for j in range(self.N):
                if i != j and not self.eq[j] and re.search(self.str[i], self.str[j]):
                    self.eq[j] = True
        self.str2 = [self.str[i] for i in range(self.N) if not self.eq[i]]
        self.N2 = len(self.str2)

        self.len = [[0]*self.N2 for _ in range(self.N2)]
        for i in range(self.N2):
            for j in range(self.N2):
                if i == j:
                    continue
                l = len(self.str2[i])
                for offset in range(l):
                    if self.str2[j].startswith(self.str2[i][offset:]):
                        self.len[i][j] = len(self.str2[j]) - (l - offset)
                        break

        self.INF = 1 << 29
        self.dp = [[self.INF]*self.N2 for _ in range(1 << self.N2)]
        for i in range(self.N2):
            self.dp[1 << i][i] = len(self.str2[i])
        for i in range(1 << self.N2):
            for j in range(self.N2):
                if self.dp[i][j] >= self.INF:
                    continue
                for k in range(self.N2):
                    if (i & (1 << k)) > 0:
                        continue
                    new_idx = i | (1 << k)
                    self.dp[new_idx][k] = min(self.dp[new_idx][k], self.dp[i][j] + self.len[j][k])

        ans = self.INF
        tmp = (1 << self.N2) - 1
        for i in range(self.N2):
            ans = min(ans, self.dp[tmp][i])
        print(ans)

p00899()