import sys
from threading import Thread, currentThread
import re

class p00899:
    def __init__(self):
        self.sc = sys.stdin

    def main(self):
        self.init()

    def init(self):
        stack_size = 8 * 1024 * 1024
        thread = Thread(target=self.AOJ1320, name="RUN", args=(stack_size,))
        thread.start()

    class AOJ1320:
        INF = 1 << 29

        def __init__(self):
            self.sc = sys.stdin

        def run(self):
            while self.sc.hasNext():
                self.N = self.sc.nextInt()
                if self.N == 0:
                    break
                self.solve()

        def solve(self):
            str = [self.sc.next() for _ in range(self.N)]

            eq = [False] * self.N
            for i in range(self.N):
                if eq[i]:
                    continue
                for j in range(self.N):
                    if i != j and not eq[j] and re.match(r".*" + str[j] + ".*", str[i]):
                        eq[j] = True

            str2 = [s for i, s in enumerate(str) if not eq[i]]
            self.N2 = len(str2)

            len = [[0] * self.N2 for _ in range(self.N2)]
            for i in range(self.N2):
                for j in range(self.N2):
                    if i == j:
                        continue
                    offset = 0
                    l = len(str2[i])
                    for offset in range(l):
                        if str2[j].startswith(str2[i][offset:]):
                            break
                    len[i][j] = len(str2[j]) - (l - offset)

            dp = [[self.INF] * self.N2 for _ in range(1 << self.N2)]
            for i in range(self.N2):
                dp[1 << i][i] = len(str2[i])
            for i in range(1 << self.N2):
                for j in range(self.N2):
                    if dp[i][j] >= self.INF:
                        continue
                    for k in range(self.N2):
                        if (i & (1 << k)) > 0:
                            continue
                        new_idx = i | (1 << k)
                        dp[new_idx][k] = min(dp[new_idx][k], dp[i][j] + len[j][k])

            ans = self.INF
            tmp = (1 << self.N2) - 1
            for i in range(self.N2):
                ans = min(ans, dp[tmp][i])
            print(ans)

if __name__ == "__main__":
    p00899().main()