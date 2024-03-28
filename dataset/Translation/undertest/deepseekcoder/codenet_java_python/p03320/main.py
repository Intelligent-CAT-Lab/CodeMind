import sys
from collections import namedtuple

P = namedtuple('P', ['x', 'd'])

def main():
    n = int(sys.stdin.readline())
    lis = []
    a = 9
    b = 10
    for i in range(1, 10):
        lis.append(P(i, -11 + i))
    lis.append(P(19, -1))

    for _ in range(15):
        for w in range(1, 1000):
            x = w * b + a
            y = x
            e = sum(int(i) for i in str(x))
            lis.append(P(y, y / e))
        b *= 10
        a *= 10
        a += b - 1

    lis.sort()
    max_val = 0
    for item in lis:
        if max_val < item.x:
            max_val = item.x
            print(max_val)
            n -= 1
            if n == 0:
                break

if __name__ == "__main__":
    main()