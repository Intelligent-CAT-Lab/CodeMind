import sys

def solve():
    k = int(input())

    if k == 1:
        print(1)
        print(1)
        return

    n = (k + 3) // 4 * 2

    ret = [[0] * n for _ in range(n)]
    for i in range(n):
        for j in range(n):
            ret[i][j] = (0 if i % 2 == 0 else n) + (i + j) % n

    for i in range(n):
        for j in range(n):
            if ret[i][j] >= k:
                ret[i][j] = (ret[i][j] - n) % k

    print(n)
    for i in range(n):
        print(' '.join(str(ret[i][j] + 1) for j in range(n)))

def main():
    start = time.time()
    solve()
    sys.stdout.flush()
    print((time.time() - start) * 1000, "ms", file=sys.stderr)

if __name__ == '__main__':
    main()