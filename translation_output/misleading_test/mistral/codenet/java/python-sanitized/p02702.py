import sys

def mod(x, y):
    return ((x % y) + y) % y

def gcd(x, y):
    while y:
        x, y = y, x % y
    return x

def p02702():
    n = int(input())
    p = 2019
    c = list(map(int, input().split()))
    d = [0] * (n + 1)
    ten = 1
    for i in range(n - 1, -1, -1):
        a = (c[i] - 48) * ten % p
        d[i] = (d[i + 1] + a) % p
        ten = (ten * 10) % p

    map = {}
    for i in range(n):
        key = d[i]
        if key not in map:
            map[key] = 1
        else:
            val = map[key]
            map[key] = val + 1

    ans = 0
    for key in map:
        val = map[key]
        ans += (val * (val - 1)) // 2

    print(ans)

if __name__ == "__main__":
    p02702()