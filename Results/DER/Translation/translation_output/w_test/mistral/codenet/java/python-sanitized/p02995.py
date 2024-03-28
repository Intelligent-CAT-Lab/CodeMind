import math

def gcd(x, y):
    if x < y:
        x, y = y, x
    if x == 0:
        return y
    else:
        return gcd(y, x % y)

def p02995():
    A, B, C, D = map(int, input().split())
    n = B - A + 1

    if C == D:
        a = A // C
        b = B // C
        x = b - a
        if A % C == 0:
            x += 1
        answer = n - x
        print(answer)
        return

    a = A // C
    b = B // C
    p = b - a
    if A % C == 0:
        p += 1

    a = A // D
    b = B // D
    q = b - a
    if A % D == 0:
        q += 1

    e = math.