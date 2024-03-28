import sys

class p02634:
    def __init__(self, A, B, C, D):
        self.A = A
        self.B = B
        self.C = C
        self.D = D
        self.MOD = 998244353
        self.cell = [[0 for _ in range(D)] for _ in range(C)]
        self.cell[A - 1][B - 1] = 1

    def calc(self):
        for i in range(self.A, self.C):
            for j in range(self.B, self.D):
                self.cell[i][j] = self.cell[i - 1][j] * j % self.MOD
                self.cell[i][j] += self.cell[i][j - 1] * i % self.MOD
                val = self.cell[i - 1][j - 1] * i % self.MOD
                val *= j
                val %= self.MOD
                self.cell[i][j] -= val
                self.cell[i][j] = (self.cell[i][j] + self.MOD) % self.MOD
                self.cell[i][j] += self.cell[i - 1][j]
                self.cell[i][j] %= self.MOD
                self.cell[i][j] += self.cell[i][j - 1]
                self.cell[i][j] %= self.MOD

    def showResult(self):
        print(self.cell[self.C - 1][self.D - 1])

# Reading input values
input_values = input().split()
A, B, C, D = map(int, input_values)

ins = p02634(A, B, C, D)
ins.calc()
ins.showResult()