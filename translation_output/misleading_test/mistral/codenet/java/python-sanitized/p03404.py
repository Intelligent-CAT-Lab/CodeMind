# Sample test case
a = 2
b = 3

# Expected output
print("98 99")
for row in grid:
    print("".join(row))

# Initialize grid
grid = [['#'] * 99 for _ in range(98)]

# Fill grid with '#' and '.'
for i in range(49):
    for j in range(i, 49):
        grid[i][j] = '#'
    for j in range(49, 99):
        grid[i][j] = '.'

# Set '.' and '#' at given positions
for i in range(a):
    grid[i // 49 * 2 + 1][i % 49 * 2 + 1] = '.'
for i in range(b):
    grid[i // 49 * 2 + 50][i % 49 * 2 + 1] = '#'

# Print grid
for row in grid:
    print("".join(row))