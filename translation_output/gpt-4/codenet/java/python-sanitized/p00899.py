import re
import sys
import threading

# Set the maximum stack size as in the original Java code
threading.stack_size(8 * 1024 * 1024)

class Solver(threading.Thread):
    def __init__(self):
        super(Solver, self).__init__()
        self.daemon = True
        self.INF = 1 << 29
        self.N = 0
        self.N2 = 0

    def run(self):
        while True:
            self.N = int(input())
            if self.N == 0:
                break
            self.solve()

    def solve(self):
        str = [input() for _ in range(self.N)]

        eq = [False] * self.N
        for i in range(self.N):
            if eq[i]:
                continue
            for j in range(self.N):
                if i != j and not eq[j] and re.search(".*?" + re.escape(str[j]) + ".*?", str[i]):
                    eq[j] = True
        
        str2 = [s for i, s in enumerate(str) if not eq[i]]
        self.N2 = len(str2)

        len_array = [[0] * self.N2 for _ in range(self.N2)]
        for i in range(self.N2):
            for j in range(self.N2):
                if i == j:
                    continue
                offset = 0
                l = len(str2[i])
                while offset < l and not str2[j].startswith(str2[i][offset:]):
                    offset += 1
                len_array[i][j] = len(str2[j]) - (l - offset)

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
                    dp[new_idx][k] = min(dp[new_idx][k], dp[i][j] + len_array[j][k])
        
        ans = self.INF
        tmp = (1 << self.N2) - 1
        for i in range(self.N2):
            ans = min(ans, dp[tmp][i])
        print(ans)

# Start Solver on a new thread with a large stack size
if __name__ == '__main__':
    Solver().start()