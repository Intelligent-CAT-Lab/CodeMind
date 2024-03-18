import sys

def calc():
    global A, B, C, D, MOD, cell
    for i in range(A, C):
        for j in range(B, D):
            cell[i][j] = cell[i - 1][j] * j
            cell[i][j] %= MOD
            cell[i][j] += cell[i][j - 1] * i
            cell[i][j] %= MOD
            val = cell[i - 1][j - 1] * i
            val %= MOD
            val *= j
            val %= MOD
            cell[i][j] -= val
            cell[i][j] += MOD
            cell[i][j] %= MOD
            cell[i][j] += cell[i - 1][j]
            cell[i][j] %= MOD
            cell[i][j] += cell[i][j - 1]
            cell[i][j] %= MOD

def showResult():
    global C, D, cell
    print(cell[C - 1][D - 1])

def main():
    global A, B, C, D, MOD, cell
    A, B, C, D = map(int, input().split())
    MOD = 998244353
    cell = [[0 for _ in range(D)] for _ in range(C)]
    cell[A - 1][B - 1] = 1

    for i in range(A, C):
        cell[i][B - 1] = cell[i - 1][B - 1] * B % MOD

    for i in range(B, D):
        cell[A - 1][i] = cell[A - 1][i - 1] * A % MOD

    calc()
    showResult()

if __name__ == "__main__":
    main()