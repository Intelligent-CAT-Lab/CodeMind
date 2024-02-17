N = int(input())

def gcd(m, n):
    while n:
        m, n = n, m % n
    return m
def lcm(m, n):
    return m // gcd(m, n) * n
def carmichael(x):
    r = 1

    b = 0
    while x & 1 == 0:
        b += 1
        x >>= 1
    if b > 1:
        r = 2 if b == 2 else 2**(b-2)

    y = 3
    while y*y <= x:
        if x % y == 0:
            c = 0
            while x % y == 0:
                x //= y
                c += 1
            r = lcm(r, (y-1) * y**(c-1))
        y += 1
    if x > 1:
        r = lcm(r, x-1)
    return r

def solve(x, c):
    if c == 1:
        return 1
    x = x % c
    sq = int(c ** .5) + 1

    mp = {}
    y = 1
    for i in range(sq):
        mp[y] = i
        y = (y * x) % c
        if y == 1:
            return i+1
        if y in mp:
            return -1
    z = 1
    for i in range(sq):
        z = (z * y) % c
        if z in mp:
            return sq*(i+1) - mp[z]
    return -1
c = carmichael(N)
k = solve(N, c)
if k == -1 or pow(N, k, c) != 1 % c:
    print(-1)
else:
    print(k)
