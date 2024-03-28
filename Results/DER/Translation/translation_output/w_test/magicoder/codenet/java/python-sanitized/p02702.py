from collections import defaultdict

def gcd(a, b):
    if b == 0:
        return a
    else:
        return gcd(b, a % b)

def p02702():
    str = input()
    n = len(str)
    p = 2019
    ans = 0
    d = [0] * (n+1)
    ten = 1
    for i in range(n-1, -1, -1):
        a = ((int(str[i]) - 0) * ten) % p
        d[i] = (d[i+1] + a) % p
        ten = (ten * 10) % p
    map = defaultdict(int)
    for i in range(n, -1, -1):
        key = d[i]
        map[key] += 1
    for key in map:
        val = map[key]
        ans += (val * (val-1)) // 2
    print(ans)

p02702()