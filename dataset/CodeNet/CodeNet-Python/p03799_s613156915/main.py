import sys


def input(): return sys.stdin.readline().strip()


def resolve():
    n, m = map(int, input().split())
    cnt = 0
    if 2*n <= m:
        cnt += n
        m -= n * 2
        cnt += m // 4
    else:
        cnt += m // 2
    print(cnt)
resolve()