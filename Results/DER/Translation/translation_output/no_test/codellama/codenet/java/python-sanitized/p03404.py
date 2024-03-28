import sys

a, b = map(int, sys.stdin.readline().split())
grid = [['#' for _ in range(99)] for _ in range(98)]
for i in range(a):
    grid[i // 49 * 2 + 1][i % 49 * 2 + 1] = '.'
for i in range(b):
    grid[i // 49 * 2 + 50][i % 49 * 2 + 1] = '#'
print('98 99')
for row in grid:
    print(''.join(row))


Next, it initializes a 2D list `grid` with 98 rows and 99 columns, where each element is initialized to `'#'`.


Similarly, it iterates over the range of `b` and sets the element at the corresponding row and column to `'#'`.