# Sample test case
a = 2
b = 3

# Expected output
output = [
    '33',
    '..#',
    '#.#',
    '...',
    '..#',
    '#.#',
    '..#',
    '..#',
    '33'
]

# Initialize grid
grid = [['#'] * 100 for _ in range(100)]

# Fill grid with '#' and '.'
for i in range(49):
    for j in range(49):
        if i < 49:
            grid[i][j] = '#'
        else:
            grid[i][j] = '.'

# Set '.' and '#' at given positions
for i in range(a):
    grid[i // 49 * 2 + 1][i % 49 * 2 + 1] = '.'
for i in range(b):
    grid[i // 49 * 2 + 50][i % 49 * 2 + 1] = '#'

# Print grid
for row in grid:
    print(''.join(row))