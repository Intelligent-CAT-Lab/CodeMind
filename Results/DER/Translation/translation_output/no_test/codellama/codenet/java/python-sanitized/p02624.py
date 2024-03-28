import sys
import math

MOD = 1000000007

def solve():
    LIMIT = 1000000000
    div = [1] * (LIMIT + 1)
    for i in range(2, LIMIT):
        for j in range(i, LIMIT, i):
            div[j] += 1

    n = int(sys.stdin.readline())
    res = 0
    for i in range(1, n + 1):
        res += i * div[i]
    print(res % MOD)

if __name__ == '__main__':
    solve()