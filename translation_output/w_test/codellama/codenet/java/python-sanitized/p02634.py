import sys

class p02634:
    def __init__(self, in_stream):
        self.A, self.B, self.C, self.D = map(int, in_stream.readline().split())
        self.MOD = 998244353
        self.cell = [[0] * self.D for _ in range(self.C)]
        self.cell[self.A - 1][self.B - 1] = 1
        for i in range(self.A, self.C):
            self.cell[i][self.B - 1] = self.cell[i - 1][self.B - 1] * self.B % self.MOD
        for j in range(self.B, self.D):
            self.cell[self.A - 1][j] = self.cell[self.A - 1][j - 1] * self.A % self.MOD
        self.calc()

    def calc(self):
        for i in range(self.A, self.C):
            for j in range(self.B, self.D):
                self.cell[i][j] = (self.cell[i - 1][j] * j + self.cell[i][j - 1] * i) % self.MOD
                val = self.cell[i - 1][j - 1] * i * j % self.MOD
                self.cell[i][j] -= val
                self.cell[i][j] += self.MOD
                self.cell[i][j] %= self.MOD

    def show_cell(self):
        for i in range(self.C):
            for j in range(self.D):
                print(self.cell[i][j], end=" ")
            print()

    def show_result(self):
        print(self.cell[self.C - 1][self.D - 1])
        # self.show_cell()

if __name__ == "__main__":
    in_stream = sys.stdin
    p02634(in_stream).show_result()