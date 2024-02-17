from math import gcd
def solve(p, q):
    GCD = gcd(p, q)
    p = p // GCD
    q = q // GCD
    print(p, q, sep="/")
s = "0.(3)"
x, y = s.split('.')
if(y[-1] != ')'):
    p = int(x) * pow(10, len(y)) + int(y)
    q = pow(10, len(y))
    solve(p, q)
else:
    y, z = y.split('(')[0], y.split('(')[1][:-1]
    a = int(x+y+z)
    b = int(x+y)
    solve(a-b, (pow(10, len(z))-1)*pow(10, len(y)))
