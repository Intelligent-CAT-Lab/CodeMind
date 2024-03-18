import sys

class p02634:
    def __init__(self, MOD=998244353):
        self.MOD = MOD

    def calc(self, A, B, C, D):
        cell = [[0 for _ in range(D)] for _ in range(C)]
        cell[A - 1][B - 1] = 1
        for i in range(A, C):
            cell[i][B - 1] = cell[i - 1][B - 1] * B % self.MOD
        for i in range(B, D):
            cell[A - 1][i] = cell[A - 1][i - 1] * A % self.MOD

        for i in range(A, C):
            for j in range(B, D):
                cell[i][j] = cell[i - 1][j] * j % self.MOD
                cell[i][j] += cell[i][j - 1] * i % self.MOD
                cell[i][j] %= self.MOD
                val = cell[i - 1][j - 1] * i % self.MOD * j % self.MOD
                cell[i][j] += self.MOD - val
                cell[i][j] %= self.MOD
                cell[i][j] += cell[i - 1][j] + cell[i][j - 1]
                cell[i][j] %= self.MOD

        return cell[C - 1][D - 1]

if __name__ == "__main__":
    reader = sys.stdin.buffer
    tokens = reader.read().decode('utf8').split()
    A, B, C, D = map(int, tokens)
    instance = p02634()
    result = instance.calc(A, B, C, D)
    print(result)