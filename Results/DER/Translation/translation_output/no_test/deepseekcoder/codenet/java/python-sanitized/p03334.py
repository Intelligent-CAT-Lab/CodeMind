import sys

def solve():
    n = scanInt()
    d1 = scanInt()
    d2 = scanInt()
    d1s = 0
    d2s = 0
    while d1 % 4 == 0:
        d1s += 1
        d1 //= 4
    while d2 % 4 == 0:
        d2s += 1
        d2 //= 4
    need = n * n
    for i in range(2 * n):
        for j in range(2 * n):
            if (d1 % 4 == 1 and ((i >> d1s) ^ (j >> d1s)) & 1 != 0):
                continue
            if (d1 % 4 == 2 and (i >> d1s) & 1 != 0):
                continue
            if (d2 % 4 == 1 and ((i >> d2s) ^ (j >> d2s)) & 1 != 0):
                continue
            if (d2 % 4 == 2 and (i >> d2s) & 1 != 0):
                continue
            print(i, j)
            need -= 1
            if need == 0:
                return
    raise AssertionError()

def scanInt():
    return int(scanString())

def scanLong():
    return long(scanString())

def scanString():
    return sys.stdin.readline().rstrip()

if __name__ == "__main__":
    try:
        solve()
    except Exception as e:
        print(e, file=sys.stderr)
        sys.exit(1)