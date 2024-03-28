import math

def p01809():
    yaku = []
    p = int(input())
    q = int(input())
    ans = 1
    bp = p
    bq = q
    buf = p
    while bq % bp != 0:
        buf = bq % bp
        bq = bp
        bp = buf
    qs = q // buf
    for i in range(2, int(math.sqrt(qs))+1):
        if qs % i == 0:
            while qs % i == 0:
                qs //= i
            ans *= i
    ans *= qs
    print(ans)

p01809()