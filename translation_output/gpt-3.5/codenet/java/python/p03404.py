```python
a = int(input()) - 1
b = int(input()) - 1
grid = [['#' for _ in range(99)] for _ in range(98)]

for i in range(98):
    if i < 49:
        grid[i] = ['#' for _ in range(99)]
    else:
        grid[i] = ['.'] + ['.'] * 98

for i in range(a):
    grid[i // 49 * 2 + 1][i % 49 * 2 + 1] = '.'

for i in range(b):
    grid[i // 49 * 2 + 50][i % 49 * 2 + 1] = '#'

print("98 99")
for row in grid:
    print(''.join(row))
```

