import sys

a, b = map(int, sys.stdin.readline().split())
grid = [['#' if i < 49 else '.' for i in range(99)] for j in range(98)]
for i in range(a):
    grid[i // 49 * 2 + 1][i % 49 * 2 + 1] = '.'
for i in range(b):
    grid[i // 49 * 2 + 50][i % 49 * 2 + 1] = '#'
print(98, 99)
for row in grid:
    print(''.join(row))