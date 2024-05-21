import sys

def gcd(a, b):
    if a < b:
        return gcd(b, a)
    if b == 0:
        return a
    return gcd(b, a % b)

def extended_gcd(a, b):
    if a == 0:
        return (b, 0, 1)
    else:
        g, x, y = extended_gcd(b % a, a)
        return (g, y - (b // a) * x, x)

def mod_inverse(a, m):
    g, x, _ = extended_gcd(a, m)
    if g!= 1:
        raise Exception('modular inverse does not exist')
    else:
        return x % m

a, b = map(int, input().split())
g = gcd(a, b)
x = mod_inverse(b // g, a // g)
print(x, (a * x) % b)