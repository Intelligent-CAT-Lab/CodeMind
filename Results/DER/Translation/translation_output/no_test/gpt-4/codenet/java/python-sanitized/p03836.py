def solve(sx, sy, tx, ty):
    dx = tx - sx
    dy = ty - sy
    
    result = []
    # sx < tx, sy < ty, therefore can be done in a specific pattern
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

if __name__ == "__main__":
    sx, sy, tx, ty = map(int, input().split())
    
    print(solve(sx, sy, tx, ty))