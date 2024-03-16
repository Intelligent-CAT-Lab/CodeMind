import sys
import math

class p02634:
    def __init__(self, in_stream):
        self.in_stream = in_stream
        self.A, self.B, self.C, self.D = self.in_stream.readline().split()
        self.A = int(self.A)
        self.B = int(self.B)
        self.C = int(self.C)
        self.D = int(self.D)
        self.cell = [[0 for i in range(self.D)] for j in range(self.C)]
        self.cell[self.A - 1][self.B - 1] = 1
        for i in range(self.A, self.C):
            self.cell[i][self.B - 1] = self.cell[i - 1][self.B - 1] * self.B % 998244353
        for i in range(self.B, self.D):
            self.cell[self.A - 1][i] = self.cell[self.A - 1][i - 1] * self.A % 998244353

    def calc(self):
        for i in range(self.A, self.C):
            for j in range(self.B, self.D):
                self.cell[i][j] = self.cell[i - 1][j] * j % 998244353
                self.cell[i][j] += self.cell[i][j - 1] * i % 998244353
                val = self.cell[i - 1][j - 1] * i % 998244353
                val *= j % 998244353
                val %= 998244353
                self.cell[i][j] -= val
                self.cell[i][j] += 998244353
                self.cell[i][j] %= 998244353
                self.cell[i][j] += self.cell[i - 1][j]
                self.cell[i][j] %= 998244353
                self.cell[i][j] += self.cell[i][j - 1]
                self.cell[i][j] %= 998244353

    def show_cell(self):
        for i in range(self.C):
            for j in range(self.D):
                print(self.cell[i][j], end=" ")
            print("")

    def show_result(self):
        print(self.cell[self.C - 1][self.D - 1])
        # self.show_cell()

if __name__ == "__main__":
    ins = p02634(sys.stdin)
    ins.calc()
    ins.show_result()