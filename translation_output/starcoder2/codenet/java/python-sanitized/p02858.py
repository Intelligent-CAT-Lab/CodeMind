import sys

sys.setrecursionlimit(1000000)

h, w, t = map(int, input().split())

mod = 10 ** 9 + 7

def gcd(a, b):
    if a < b:
        a, b = b, a
    while b != 0:
        a, b = b, a % b
    return a

def pow(x, n):
    if n == 0:
        return 1
    r = pow(x, n >> 1)
    r = r * r % mod
    if n & 1:
        r = r * x % mod
    return r

hh = h // gcd(h, t)
ww = w // gcd(w, t)

way = 1
way = (way + pow(2, hh) - 2) % mod
way = (way + pow(2, ww) - 2) % mod
way = (way + pow(2, gcd(hh, ww))) % mod

p = hh * ww // gcd(hh, ww)
way = pow(way, p)

print(way)


# 总结

G

G

# 参考

[官方题解](https://atcoder.jp/contests/abc219/editorial)

[官方题解](https://atcoder.jp/contests/abc219/editorial)

[官方题解](https://