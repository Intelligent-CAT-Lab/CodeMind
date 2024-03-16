import sys

a = int(sys.stdin.readline().strip())
b = int(sys.stdin.readline().strip())

grid = [['#'] * 49 for _ in range(49)]

for i in range(a):
    grid[i // 49][i % 49] = '.'

for i in range(b):
    grid[i // 49][i % 49] = '#'

for row in grid:
    print(''.join(row))