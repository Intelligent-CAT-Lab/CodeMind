import sys

def main():
    A, B, C, D = map(int, sys.stdin.readline().split())
    MOD = 998244353
    cell = [[0] * D for _ in range(C)]
    cell[A - 1][B - 1] = 1
    for i in range(A, C):
        cell[i][B - 1] = cell[i - 1][B - 1] * B % MOD
    for j in range(B, D):
        cell[A - 1][j] = cell[A - 1][j - 1] * A % MOD
    for i in range(A, C):
        for j in range(B, D):
            cell[i][j] = (cell[i - 1][j] * j + cell[i][j - 1] * i) % MOD
    print(cell[C - 1][D - 1])

if __name__ == "__main__":
    main()