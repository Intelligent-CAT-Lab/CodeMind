解析


import sys

def solve():
    n = int(sys.stdin.readline())
    d1 = int(sys.stdin.readline())
    d2 = int(sys.stdin.readline())
    d1s = 0
    d2s = 0
    while d1 & 3 == 0:
        d1s += 1
        d1 >>= 2
    while d2 & 3 == 0:
        d2s += 1
        d2 >>= 2
    need = n * n
    for i in range(2 * n):
        for j in range(2 * n):
            if d1 & 3 == 1 and ((i >> d1s) ^ (j >> d1s)) & 1 != 0:
                continue
            if d1 & 3 == 2 and ((i >> d1s) & 1) != 0:
                continue
            if d2 & 3 == 1 and ((i >> d2s) ^ (j >> d2s)) & 1 != 0:
                continue
            if d2 & 3 == 2 and ((i >> d2s) & 1) != 0:
                continue
            print(i, j)
            if need == 0:
                return
    raise AssertionError()

def scanInt():
    return int(sys.stdin.readline())

def scanLong():
    return long(sys.stdin.readline())

def scanString():
    while tok == None or not tok.hasMoreTokens():
        tok = StringTokenizer(sys.stdin.readline())
    return tok.nextToken()

in = sys.stdin
out = sys.stdout
tok = StringTokenizer(in.readline())

solve()

in.close()
out.close()