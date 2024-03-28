import sys
import math

n, x, y = map(int, input().split())
edges = [0] * (n + 1)

for i in range(n):
    for j in range(i + 1, n):
        edge = min(j - i, min(abs(x - i) + abs(j - y), abs(y - i) + abs(j - x)) + 1)
        edges[edge] += 1

for i in range(1, n):
    print(edges[i])