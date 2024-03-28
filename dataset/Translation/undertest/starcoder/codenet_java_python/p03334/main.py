import sys

def solve():
    n, d1, d2 = map(int, raw_input().split())
    d1s, d2s = 0, 0
    while d1 & 3 == 0:
        d1 >>= 2
        d1s += 1
    while d2 & 3 == 0:
        d2 >>= 2
        d2s += 1
    need = n * n
    for i in xrange(2 * n):
        for j in xrange(2 * n):
            if d1 & 3 == 1 and (((i >> d1s) ^ (j >> d1s)) & 1)!= 0:
                continue
            if d1 & 3 == 2 and (i >> d1s) & 1!= 0:
                continue
            if d2 & 3 == 1 and (((i >> d2s) ^ (j >> d2s)) & 1)!= 0:
                continue
            if d2 & 3 == 2 and (i >> d2s) & 1!= 0:
                continue
            print i, j
            need -= 1
            if need == 0:
                return

def main():
    solve()

if __name__ == '__main__':
    main()
    sys.exit(0)