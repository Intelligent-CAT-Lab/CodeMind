import sys

class p02634:
    def __init__(self, in_stream):
        self.in_stream = in_stream
        self.A, self.B, self.C, self.D = map(int, self.in_stream.readline().split())
        self.cell = [[0 for j in range(self.D)] for i in range(self.C)]
        self.cell[self.A - 1][self.B - 1] = 1
        for i in range(self.A, self.C):
            self.cell[i][self.B - 1] = self.cell[i - 1][self.B - 1] * self.B % 998244353
        for i in range(self.B, self.D):
            self.cell[self.A - 1][i] = self.cell[self.A - 1][i - 1] * self.A % 998244353

    def calc(self):
        for i in range(self.A, self.C):
            for j in range(self.B, self.D):
                # ãã®ãã¹ãç½ã®å ´å: ä¾ãã°ï¼å·¦ã®ãã¿ã¼ã³ * ä¸ä¸åã®ãããããé»
                self.cell[i][j] = self.cell[i - 1][j] * j % 998244353
                self.cell[i][j] += self.cell[i][j - 1] * i % 998244353
                self.cell[i][j] %= 998244353
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

    def showCell(self):
        for i in range(self.C):
            for j in range(self.D):
                print(self.cell[i][j], end=" ")
            print()

    def showResult(self):
        print(self.cell[self.C - 1][self.D - 1])
        # self.showCell()

if __name__ == '__main__':
    ins = p02634(sys.stdin)
    ins.calc()
    ins.showResult()