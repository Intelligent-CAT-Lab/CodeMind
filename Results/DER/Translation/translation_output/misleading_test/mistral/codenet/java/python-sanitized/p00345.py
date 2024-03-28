import sys

def gcd(a, b):
    if b == 0:
        return a
    else:
        return gcd(b, a % b)

def lcm(a, b):
    return a * (b // gcd(a, b))

an, ad, bn, bd = 0, 1, 0, 1

line = sys.stdin.readline()

units = line.split("[()]")

if len(units) == 2:
    bn = int(units[1])
    bd = (10 ** len(units[1])) - 1
else:
    an = int(units[0])

units = units[0].split(".")

if len(units) == 2:
    bd *= (10 ** len(units[1]))
    an = int(units[0] + units[1])
    ad = (10 ** len(units[1]))
else:
    an = int(units[0])

n, d, g = 0, 0, 0

d = lcm(ad, bd)
n = an * (d // ad) + bn * d // bd
g = gcd(n, d)
n //= g
d //= g

print(n, d)