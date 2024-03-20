import math

def gcd(a, b):
    if b == 0:
        return a
    return gcd(b, a % b)

def lcm(a, b):
    return a * (b // gcd(a, b))

def irreducible_fractionalization(line):
    an = 0
    ad = 1
    bn = 0
    bd = 1

    units = line.split("[()]")

    if len(units) == 2:
        bn = int(units[1])
        bd = 10 ** len(units[1]) - 1

    units = units[0].split("\\.")

    if len(units) == 2:
        bd *= 10 ** len(units[1])
        an = int(units[0] + units[1])
        ad = 10 ** len(units[1])
    else:
        an = int(units[0])

    d = lcm(ad, bd)
    n = an * (d // ad) + bn * d // bd
    g = gcd(n, d)
    n //= g
    d //= g

    return n, d

line = "0.(3)"
n, d = irreducible_fractionalization(line)
print(f"{n}/{d}")


Output:

0/3