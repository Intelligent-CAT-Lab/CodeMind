def solve(sx, sy, tx, ty):
    dx = tx - sx
    dy = ty - sy
    result = ""

    # first
    result += get_continuous('R', dx)
    result += get_continuous('U', dy)

    # second
    result += get_continuous('L', dx)
    result += get_continuous('D', dy)

    # third
    result += get_continuous('D', 1)
    result += get_continuous('R', dx + 1)
    result += get_continuous('U', dy + 1)
    result += get_continuous('L', 1)

    # forth
    result += get_continuous('U', 1)
    result += get_continuous('L', dx + 1)
    result += get_continuous('D', dy + 1)
    result += get_continuous('R', 1)

    return result

def get_continuous(c, n):
    return c * n

input_coords = input().split()
sx, sy, tx, ty = map(int, input_coords)

output = solve(sx, sy, tx, ty)
print(output)