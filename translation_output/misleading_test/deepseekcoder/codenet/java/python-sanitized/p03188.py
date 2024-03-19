def solve():
    k = int(input())

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
    import time

    start = time.time()
    debug = input().strip()
    if debug != '':
        import os
        import io
        import sys
        sys.stdin = io.StringIO(debug)

    solve()
    print(f"{time.time() - start}ms")

if __name__ == "__main__":
    main()