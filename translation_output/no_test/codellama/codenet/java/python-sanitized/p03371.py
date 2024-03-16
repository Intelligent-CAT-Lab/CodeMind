import sys
import math

def main():
    a, b, c, x, y = map(int, sys.stdin.readline().split())
    if a + b < 2 * c:
        print(x * a + y * b)
    else:
        min_xy = min(x, y)
        max_xy = max(x, y)
        res = 0
        res += 2 * c * min_xy
        if max_xy == x:
            res += math.min(a, 2 * c) * (max_xy - min_xy)
        else:
            res += math.min(b, 2 * c) * (max_xy - min_xy)
        print(res)

if __name__ == "__main__":
    main()