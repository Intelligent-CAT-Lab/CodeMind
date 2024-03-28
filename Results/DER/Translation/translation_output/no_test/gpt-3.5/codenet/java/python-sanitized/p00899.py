import sys

class p00899:
    def __init__(self):
        self.sc = sys.stdin
        self.N = 0

    def main(self):
        self.init()

    def init(self):
        STACK_SIZE = 8 * 1024 * 1024
        Thread(target=self.AOJ1320, args=(), name="RUN", stack_size=STACK_SIZE).start()

    class AOJ1320:
        def __init__(self):
            pass

        def run(self):
            while True:
                try:
                    self.N = int(input())
                    if self.N == 0:
                        break
                    self.solve()
                except EOFError:
                    break

        INF = 1 << 29

        def solve(self):
            str_list = [input() for _ in range(self.N)]

            eq = [False] * self.N
            for i in range(self.N):
                if eq[i]:
                    continue
                for j in range(self.N):
                    if i != j and not eq[j] and str_list[i] in str_list[j]:
                        eq[j] = True

            str2 = [str_list[i] for i in range(self.N) if not eq[i]]
            self.N2 = len(str2)

            len_mat = [[0] * self.N2 for _ in range(self.N2)]
            for i in range(self.N2):
                for j in range(self.N2):
                    if i == j:
                        continue
                    offset = 0
                    l = len(str2[i])
                    while offset < l:
                        if str2[j].startswith(str2[i][offset:]):
                            break
                        offset += 1
                    len_mat[i][j] = len(str2[j]) - (l - offset)

            dp = [[self.INF] * self.N2 for _ in range(1 << self.N2)]
            for i in range(self.N2):
                dp[1 << i][i] = len(str2[i])
            for i in range(1 << self.N2):
                for j in range(self.N2):
                    if dp[i][j] >= self.INF:
                        continue
                    for k in range(self.N2):
                        if i & (1 << k) > 0:
                            continue
                        new_idx = i | (1 << k)
                        dp[new_idx][k] = min(dp[new_idx][k], dp[i][j] + len_mat[j][k])

            ans = self.INF
            tmp = (1 << self.N2) - 1
            for i in range(self.N2):
                ans = min(ans, dp[tmp][i])
            print(ans)

p00899().main()