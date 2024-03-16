import math

def main():
    # Variables
    count = 0
    sw = False
    max = float("-inf")
    min = float("inf")
    dMax = float("-inf")
    dMin = float("inf")
    answer = 0

    # Input
    A = int(input())
    B = int(input())
    C = int(input())
    D = int(input())

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

    e = lcm(C, D)
    a = A // e
    b = B // e
    r = b - a
    if A % e == 0:
        r += 1

    answer = n - (p + q - r)

    # Output
    print(answer)

def gcd(x, y):