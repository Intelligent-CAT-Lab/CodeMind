class p00979:
    low = 1
    high = 3 ** 32
    n = 0

    def main(self):
        self.n = int(input())
        ans = self.dfs(1, 1)
        print(ans + 1)

    def dfs(self, pos, pace):
        if pos > self.n:
            return 0
        # 3.0X
        if pace < self.high:
            npace = 3 * pace
            npos = pos + npace
            if npos == self.n and (npace == 1 or npace == 3):
                return 1
            else:
                temp = self.dfs(npos, npace)
                if temp != 0:
                    return 1 + temp
        #