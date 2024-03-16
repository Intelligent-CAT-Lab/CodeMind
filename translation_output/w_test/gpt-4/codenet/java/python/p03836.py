Here's the translated Python code:

```python
def solve(sx, sy, tx, ty):
    dx = tx - sx
    dy = ty - sy
    
    result = []
    # first
    result.append('R' * dx)
    result.append('U' * dy)
    
    # second
    result.append('L' * dx)
    result.append('D' * dy)
    
    # third
    result.append('D')
    result.append('R' * (dx + 1))
    result.append('U' * (dy + 1))
    result.append('L')
    
    # forth
    result.append('U')
    result.append('L' * (dx + 1))
    result.append('D' * (dy + 1))
    result.append('R')
    
    return ''.join(result)

# Test case
sx, sy, tx, ty = map(int, input().split())
print(solve(sx, sy, tx, ty))
```

To use the provided test case, you'd call the script and input the numbers separated by spaces:

Test input:
```
0 0 1 2
```

Expected output:
```
UURDDLLUUURRDRDDDLLU
```
