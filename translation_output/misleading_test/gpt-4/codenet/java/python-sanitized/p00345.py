from fractions import Fraction

def gcd(a, b):
    while b:
        a, b = b, a % b
    return a

def lcm(a, b):
    return a * b // gcd(a, b)

def irreducible_fractionalization():
    line = input()
    units = line.split('(')

    an, ad, bn, bd = 0, 1, 0, 1

    if len(units) == 2:
        units[1] = units[1].replace(')', '')  # Remove the ')'
        bn = int(units[1])
        bd = 10**len(units[1]) - 1  # `(int) Math.pow(10, units[1].length()) - 1`

    units = units[0].split('.')

    if len(units) == 2:
        bd *= 10**len(units[1])
        an = int(units[0] + units[1])
        ad = 10**len(units[1])
    else:
        an = int(units[0])

    n, d = an * lcm(ad, bd) // ad + bn * lcm(ad, bd) // bd, lcm(ad, bd)
    g = gcd(n, d)
    n //= g
    d //= g

    return f"{n}/{d}"

# Test case
print(irreducible_fractionalization())