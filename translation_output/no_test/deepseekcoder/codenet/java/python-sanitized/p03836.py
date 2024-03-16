import sys

def main():
    sx = int(sys.stdin.readline().strip())
    sy = int(sys.stdin.readline().strip())
    tx = int(sys.stdin.readline().strip())
    ty = int(sys.stdin.readline().strip())

    print(solve(sx, sy, tx, ty))

def solve(sx, sy, tx, ty):
    dx = tx - sx
    dy = ty - sy

    b = []
    # sx < tx, sy < ty ならば 移動できる
    # first
    b.append(renzoku('R', dx))
    b.append(renzoku('U', dy))

    # second
    b.append(renzoku('L', dx))
    b.append(renzoku('D', dy))

    # third
    b.append(renzoku('D', 1))
    b.append(renzoku('R', dx + 1))
    b.append(renzoku('U', dy + 1))
    b.append(renzoku('L', 1))

    # forth
    b.append(renzoku('U', 1))
    b.append(renzoku('L', dx + 1))
    b.append(renzoku('D', dy + 1))
    b.append(renzoku('R', 1))

    return ''.join(b)

def renzoku(c, n):
    return c * n

if __name__ == "__main__":
    main()