import sys

MOD = 998244353

class P02634:
    def __init__(self):
        tokens = input().split()
        self.A = int(tokens[0])
        self.B = int(tokens[1])
        self.C = int(tokens[2])
        self.D = int(tokens[3])
        self.cell = [[0 for _ in range(self.D)] for _ in range(self.C)]
        self.cell[self.A - 1][self.B - 1] = 1
        for i in range(self.A, self.C):
            self.cell[i][self.B - 1] = self.cell[i - 1][self.B - 1] * self.B % MOD
        for i in range(self.B, self.D):
            self.cell[self.A - 1][i] = self.cell[self.A - 1][i - 1] * self.A % MOD
    
    def calc(self):
        for i in range(self.A, self.C):
            for j in range(self.B, self.D):
                self.cell[i][j] = self.cell[i - 1][j] * j % MOD
                self.cell[i][j] += self.cell[i][j - 1] * i % MOD
                self.cell[i][j] %= MOD
                val = self.cell[i - 1][j - 1] * i % MOD * j % MOD
                self.cell[i][j] = (self.cell[i][j] - val + MOD) % MOD
                self.cell[i][j] += self.cell[i - 1][j] + self.cell[i][j - 1]
                self.cell[i][j] %= MOD
    
    def showResult(self):
        print(self.cell[self.C - 1][self.D - 1])


def main():
    instance = P02634()
    instance.calc()
    instance.showResult()

if __name__ == "__main__":
    main()