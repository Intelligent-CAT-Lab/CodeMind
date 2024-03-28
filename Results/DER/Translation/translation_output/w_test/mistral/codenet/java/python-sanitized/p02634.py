import sys

def calc(A, B, C, D):
    cell = [[0 for _ in range(D)] for _ in range(C)]
    cell[A - 1][B - 1] = 1
    for i in range(A, C):
        cell[i][B - 1] = (cell[i - 1][B - 1] * B) % 998244353
    for i in range(B, D):
        cell[A - 1][i] = (cell[A - 1][i - 1] * A) % 998244353

    for i in range(A, C):
        for j in range(B, D):
            cell[i][j] = ((cell[i - 1][j] * (j - 1)) + (cell[i][j - 1] * i)) % 998244353

    val = (cell[A - 1][B - 1] * (i - 1)) % 998244353
    val = (val * (j - 1)) % 998244353
    cell[i][j] -= val
    cell[i][j] += 998244353
    cell[i][j] %= 998244353
    cell[i][j] += cell[i - 1][j]
    cell[i][j] %= 998244353
    cell[i][j] += cell[i][j - 1]
    cell[i][j] %= 998244353

    return cell[C - 1][D - 1]

def main():
    A, B, C, D = map(int, sys.stdin.readline().strip().split())
    result = calc(A, B, C, D)
    print(result)

if __name__ == "__main__":
    main()