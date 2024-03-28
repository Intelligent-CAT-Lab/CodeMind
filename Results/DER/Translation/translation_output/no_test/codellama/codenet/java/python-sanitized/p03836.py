import sys

def solve(sx, sy, tx, ty):
    dx = tx - sx
    dy = ty - sy

    # first
    b = 'R' * dx + 'U' * dy

    # second
    b += 'L' * dx + 'D' * dy

    # third
    b += 'D' + 'R' * (dx + 1) + 'U' * (dy + 1) + 'L'

    # forth
    b += 'U' + 'L' * (dx + 1) + 'D' * (dy + 1) + 'R'

    return b

if __name__ == '__main__':
    sx, sy, tx, ty = map(int, sys.stdin.readline().split())
    print(solve(sx, sy, tx, ty))