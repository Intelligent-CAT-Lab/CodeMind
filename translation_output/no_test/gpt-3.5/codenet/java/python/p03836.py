```python
def solve(sx, sy, tx, ty):
    dx = tx - sx
    dy = ty - sy

    result = []
    
    # first
    result.append(repeat('R', dx))
    result.append(repeat('U', dy))
    
    # second
    result.append(repeat('L', dx))
    result.append(repeat('D', dy))
    
    # third
    result.append(repeat('D', 1))
    result.append(repeat('R', dx + 1))
    result.append(repeat('U', dy + 1))
    result.append(repeat('L', 1))
    
    # fourth
    result.append(repeat('U', 1))
    result.append(repeat('L', dx + 1))
    result.append(repeat('D', dy + 1))
    result.append(repeat('R', 1))
    
    return ''.join(result)

def repeat(c, n):
    return c * n

sx, sy, tx, ty = map(int, input().split())
print(solve(sx, sy, tx, ty))
```  
