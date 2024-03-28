def solve(sx, sy, tx, ty):
    dx = tx - sx
    dy = ty - sy

    result = ""
    result += renzoku('R', dx)
    result += renzoku('U', dy)
    result += renzoku('L', dx)
    result += renzoku('D', dy)
    result += renzoku('D', 1)
    result += renzoku('R', dx + 1)
    result += renzoku('U', dy + 1)
    result += renzoku('L', 1)
    result += renzoku('U', 1)
    result += renzoku('L', dx + 1)
    result += renzoku('D', dy + 1)
    result += renzoku('R', 1)

    return result

def renzoku(c, n):
    return c * n

# Test input
sx, sy, tx, ty = map(int, input().split())

# Output
print(solve(sx, sy, tx, ty))