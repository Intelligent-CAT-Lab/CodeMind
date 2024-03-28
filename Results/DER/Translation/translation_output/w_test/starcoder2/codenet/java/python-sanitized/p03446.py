import math

def one2D(a, p, b, q):
    return math.floor(math.pow(b, p - 1) + math.pow(a, q - 1) - 1) % P

def pow(a, b):
    ret = 1
    for i in range(b):
        ret = (ret * a) % P
    return ret

def preCalc():
    ways = []
    for i in range(C):
        ways.append([])
        for j in range(i + 1):
            ways[i].append(0)
        ways[i][0] = ways[i][i] = 1
        for j in range(1, i):
            ways[i][j] = (ways[i - 1][j] + ways[i - 1][j - 1]) % P
    return ways

def submit():
    a = int(input())
    b = int(input())
    c = int(input())
    d = int(input())
    e = int(input())
    f = int(input())

    if d % a != 0 or e % b != 0 or f % c != 0:
        print(0)
        return

    p = d // a
    q = e // b
    r = f // c

    dp = []
    for i in range(p + 1):
        dp.append([])
        for j in range(q + 1):
            dp[i].append(0)
    dp[p][q] = 1

    ans = 0

    for x in range(p - 1,