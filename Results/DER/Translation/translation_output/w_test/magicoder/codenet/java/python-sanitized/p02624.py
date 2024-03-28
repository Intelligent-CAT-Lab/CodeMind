import sys

def solve():
    LIMIT = 1000 * 10000 + 10
    div = [1] * LIMIT
    for i in range(2, LIMIT):
        for j in range(i, LIMIT, i):
            div[j] += 1

    res = 0
    n = int(sys.stdin.readline())
    for i in range(1, n + 1):
        res += i * div[i]
    print(res)

solve()