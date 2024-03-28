import math
import sys

def repow(b, p):
    a = b
    res = 1
    while p > 0:
        if p % 2 == 1:
            res *= a
        a *= a
        p //= 2
    return res

def repow_mod(b, p, modder):
    a = b % modder
    res = 1
    while p > 0:
        if p % 2 == 1:
            res = (res * a) % modder
        a = (a * a) % modder
        p //= 2
    return res

def main():
    n, m = map(int, input().split())
    if n % 2 == 1:
        f = 1
        t = n
        for i in range(m):
            print(f, t)
            f += 1
            t -= 1
    else:
        f = 1
        t = n
        i = 0
        for i in range((m + 1) // 2):
            print(f, t)
            f += 1
            t -= 1
        t -= 1
        for i in range(i, m):
            print(f, t)
            f += 1
            t -= 1

if __name__ == "__main__":
    main()
    sys.stdout.flush()