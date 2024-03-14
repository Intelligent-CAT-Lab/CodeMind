import sys

def solve():
    k = ni()

    if k == 1:
        print(1)
        print(1)
        return
    n = (k + 3) // 4 * 2

    ret = [[0]*n for _ in range(n)]
    for i in range(n):
        for j in range(n):
            ret[i][j] = (i % 2 == 0) and 0 or n + (i + j) % n

    for i in range(n):
        for j in range(n):
            if ret[i][j] >= k:
                ret[i][j] = (ret[i][j] - n) % k

    print(n)
    for i in range(n):
        for j in range(n):
            print(ret[i][j] + 1, end=' ')
        print()

def main():
    import threading
    start = sys.stdin.readline()
    debug = start.split()
    if debug:
        try:
            import os
            sys.stdin = open(os.path.join(debug[0]), 'r')
        except:
            raise RuntimeError
    threading.Thread(target=solve).start()

def next():
    return sys.stdin.readline().strip()

def ni():
    return int(next())

def nl():
    return long(next())

def na(n):
    return [ni() for _ in range(n)]

def ns():
    return next().decode('utf-8')

def nal(n):
    return [nl() for _ in range(n)]

def ntable(n, m):
    return [na(m) for _ in range(n)]

def nlist(n, m):
    return [ntable(n, m) for _ in range(m)]

if __name__ == '__main__':
    main()