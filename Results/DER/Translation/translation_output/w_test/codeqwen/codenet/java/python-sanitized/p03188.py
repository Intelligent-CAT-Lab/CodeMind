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
            ret[i][j] = (i % 2 == 0 ? 0 : n) + (i + j) % n

    for i in range(n):
        for j in range(n):
            if ret[i][j] >= k:
                ret[i][j] = (ret[i][j] - n) % k

    print(n)
    for i in range(n):
        for j in range(n):
            print(ret[i][j] + 1, end=' ')
        print()

if __name__ == "__main__":
    if len(sys.argv) > 1:
        with open(sys.argv[1], 'r') as f:
            sys.stdin = f
    solve()