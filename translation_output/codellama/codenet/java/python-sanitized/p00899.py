import java.util.*;
import static java.lang.Math.*;

class p00899:
    def __init__(self):
        self.sc = Scanner(System.in)
        self.init()

    def init(self):
        STACK_SIZE = 8 * 1024 * 1024
        Thread(None, AOJ1320(), "RUN", STACK_SIZE).start()

    class AOJ1320(Runnable):
        def __init__(self):
            self.N = 0
            self.N2 = 0
            self.INF = 1 << 29

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
                    if i != j and not eq[j] and str[i].matches(".*?" + str[j] + ".*?"):
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