import sys

n, x, y = map(int, sys.stdin.readline().split())
edges = [0] * (n+1)

for i in range(n):
    for j in range(i+1, n):
        edge = min(abs(x-i) + abs(j-y), abs(y-i) + abs(j-x)) + 1
        edges[edge] += 1

for i in range(1, n):
    print(edges[i])