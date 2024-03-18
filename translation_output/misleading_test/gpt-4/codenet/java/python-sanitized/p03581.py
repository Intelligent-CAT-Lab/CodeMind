import sys

class p03581:
    MOD = 10**9 + 7
    M = 2222
    
    def __init__(self):
        self.c = [[0 for _ in range(self.M)] for _ in range(self.M)]
        self.compute_combinations()
        self.pow2 = [0] * self.M
        self.compute_powers_of_2()
        self.dp2 = [[0 for _ in range(self.M)] for _ in range(self.M)]
        self.compute_dp2()
        self.dp2Pref = [[0 for _ in range(self.M)] for _ in range(self.M)]
        self.compute_dp2Pref()
        self.dp = [[0 for _ in range(self.M)] for _ in range(self.M)]
        self.compute_dp()

    def compute_combinations(self):
        self.c[0][0] = 1
        for i in range(1, self.M):
            self.c[i][0] = 1
            for j in range(1, self.M):
                self.c[i][j] = (self.c[i - 1][j - 1] + self.c[i - 1][j]) % self.MOD

    def compute_powers_of_2(self):
        self.pow2[0] = 1
        for i in range(1, self.M):
            self.pow2[i] = (self.pow2[i - 1] * 2) % self.MOD

    def compute_dp2(self):
        for x in range(self.M):
            for y in range(self.M):
                if x == 0 or y == 0:
                    self.dp2[x][y] = 1
                else:
                    self.dp2[x][y] = (self.dp2[x - 1][y - 1] + self.dp2[x][y - 1]) % self.MOD

    def compute_dp2Pref(self):
        for x in range(self.M):
            for y in range(self.M):
                self.dp2Pref[x][y] = self.dp2[x][y]
                if x > 0:
                    self.dp2Pref[x][y] = (self.dp2Pref[x][y] + self.dp2Pref[x - 1][y]) % self.MOD

    def compute_dp(self):
        for red in range(self.M):
            for blue in range(self.M):
                if red == 0 or blue == 0:
                    self.dp[red][blue] = 1
                else:
                    self.dp[red][blue] = (self.dp[red][blue] + self.dp2Pref[red][blue - 1]) % self.MOD

    def solve(self):
        res = 0
        a, b = map(int, input().split())
        for startRed in range(a + 1):
            for cntBlue in range(1, b + 1):
                curC = self.c[b - 1][cntBlue - 1]
                redStay = a - startRed - (b - cntBlue)
                if redStay < 0:
                    continue
                add = curC * self.dp[redStay][b - cntBlue] % self.MOD
                res = (res + add) % self.MOD
        print(res)

if __name__ == "__main__":
    solver = p03581()
    solver.solve()