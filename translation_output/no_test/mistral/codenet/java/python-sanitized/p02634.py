import sys

def p02634():
    A, B, C, D = map(int, sys.stdin.readline().split())
    cell = [[0 for _ in range(D)] for _ in range(C)]
    cell[A - 1][B - 1] = 1
    for i in range(A, C):
        cell[i][B - 1] = (cell[i - 1][B - 1] * B) % 998244353
    for i in range(B, D):
        cell[A - 1][i] = (cell[A - 1][i - 1] * A) % 998244353
    for i in range(1, C):
        for j in range(1, D):
            cell[i][j] = ((cell[i - 1][j] * (j - 1)) + (cell[i][j - 1] * (i - 1))) % 998244353
    return cell[C - 1][D - 1]

if __name__ == "__main__":
    print(p02634())