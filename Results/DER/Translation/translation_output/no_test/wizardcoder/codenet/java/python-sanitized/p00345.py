import math

def gcd(a, b):
    if b == 0:
        return a
    return gcd(b, a % b)

def lcm(a, b):
    return a * (b // gcd(a, b))

def irreducible_fractionalization(line):
    units = line.split("[()]")
    bn = int(units[1]) if len(units) == 2 else 0
    bd = int(math.pow(10, len(units[1]))) - 1 if len(units) == 2 else 1
    units = units[0].split("\\.")
    an = int(units[0] + units[1]) if len(units) == 2 else int(units[0])
    ad = int(math.pow(10, len(units[1]))) if len(units) == 2 else 1
    d = lcm(ad, bd)
    n = an * (d // ad) + bn * d // bd
    g = gcd(n, d)
    n //= g
    d //= g
    return n, d

line = input()
n, d = irreducible_fractionalization(line)
print(n, d)