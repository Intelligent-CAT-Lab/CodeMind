import math
import sys

def main():
    sc = sys.stdin.readline
    out = sys.stdout.write

    n = int(sc())
    c = list(sc().strip())

    if c[0] == '0' or c[-1] == '1':
        out(-1)
        return

    for i in range(n // 2):
        if c[i] != c[n - i - 2]:
            out(-1)
            return

    out(1, 2)

    for i in range(3, n + 1):
        out(i - 2, i)
        if c[i - 2] == '1':
            out(i)

if __name__ == "__main__":
    main()