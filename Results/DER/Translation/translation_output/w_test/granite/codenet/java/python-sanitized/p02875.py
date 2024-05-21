import sys

mod = 998244353

def pow(x, y):
    res = 1
    while y > 0:
        if y % 2 == 1:
            res = (res * x) % mod
        x = (x * x) % mod
        y //= 2
    return res

def main():
    n = int(input()) // 2
    res = 7
    p2 = 8
    num = 1
    den = 2
    for i in range(1, n):
        res = (res * 9) % mod
        if i > 1:
            inc = (p2 * num) % mod
            inc = (inc * pow(den, mod - 2)) % mod
            res = (res + inc) % mod
        p2 = (p2 * 2) % mod
        num = (num * (2 * i)) % mod
        num = (num * (2 * i + 1)) % mod
        if i > 1:
            den = (den * (i - 1)) % mod
        den = (den * (i + 2)) % mod
    print(res)

if __name__ == "__main__":
    sys.exit(main())