import sys

a, b = map(int, sys.stdin.readline().split())

grid = [['.' for j in range(99)] for i in range(98)]

for i in range(49):
    grid[i][i] = '#'
    grid[i][98-i-1] = '#'

for i in range(a):
    grid[i//49*2+1][i%49*2+1] = '.'

for i in range(b):
    grid[i//49*2+50][i%49*2+1] = '#'

print("98 99")
for row in grid:
    print(''.join(row))