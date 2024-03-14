import sys
from math import pow

P = pow(10, 9) + 7
C = 110

def submit():
    a = nextInt()
    b = nextInt()
    c = nextInt()
    d = nextInt()
    e = nextInt()
    f = nextInt()

    if d % a != 0 or e % b != 0 or f % c != 0:
        print(0)
        return

    p = d // a
    q = e // b
    r = f // c

    dp = [[0 for _ in range(q + 1)] for _ in range(p + 1)]
    dp[p][q] = 1

    ans = 0

    for x in range(p - 1, 0, -1):
        for y in range(q - 1, 0, -1):
            dp[x][y] = (int(pow(c, (p - x) * (q - y))) * ways[p][x] * ways[q][y]