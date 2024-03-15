import sys

MOD = 998244353

class P02634:
    def __init__(self, lines: list[str]):
        tokens = lines[0].split(' ')
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
                # This cell is white: for example, the pattern to the left * either of the cells below is black
                self.cell[i][j] = self.cell[i - 1][j] * j
                self.cell[i][j] %= MOD
                self.cell[i][j] += self.cell[i][j - 1] * i
                self.cell[i][j] %= MOD
                val = self.cell[i - 1][j - 1] * i
                val %= MOD
                val *= j
                val %= MOD
                self.cell[i][j] -= val
                self.cell[i][j] += MOD
                self.cell[i][j] %= MOD
                self.cell[i][j] += self.cell[i - 1][j]
                self.cell[i][j] %= MOD
                self.cell[i][j] += self.cell[i][j - 1]
                self.cell[i][j] %= MOD

    def show_cell(self):
        for i in range(self.C):
            for j in range(self.D):
                print(f"{self.cell[i][j]} ", end='')
            print()

    def show_result(self):
        print(self.cell[self.C - 1][self.D - 1])
        # self.show_cell()


def main():
    reader = sys.stdin.buffer.read().decode('utf-8')
    lines = reader.splitlines()
    ins = P02634(lines)
    ins.calc()
    ins.show_result()

if __name__ == "__main__":
    main()