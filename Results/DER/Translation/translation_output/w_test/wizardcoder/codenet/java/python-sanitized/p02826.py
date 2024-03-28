import sys

MOD = int(sys.stdin.readline().strip())
N = int(sys.stdin.readline().strip())

table = [[0] * (N+1) for _ in range(N+1)]

for i in range(N+1):
    table[N][i] = i

for i in range(N-1, 0, -1):
    for j in range(N+1):
        table[i][j] = table[i+1][j]
        if j >= i:
            table[i][j] += table[i][j-i]
            table[i][j] %= MOD

print(table[1][N])