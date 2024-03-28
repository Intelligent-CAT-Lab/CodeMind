import sys

MOD = 1000000007

n, k = map(int, sys.stdin.readline().split())

nChK = [[0 for i in range(k + 1)] for j in range(n + 1)]

for i in range(n + 1):
    nChK[i][0] = 1
    nChK[i][i] = 1

for i in range(2, n + 1):
    for j in range(1, i // 2 + 1):
        nChK[i][j] = (nChK[i - 1][j] + nChK[i - 1][j - 1]) % MOD
        nChK[i][i - j] = nChK[i][j]

numberOfSequencesOfSizeIwithElementBigger