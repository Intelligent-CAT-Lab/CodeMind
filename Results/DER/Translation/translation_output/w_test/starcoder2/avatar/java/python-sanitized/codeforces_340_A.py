import math

def gcd(a, b):
    if a < b:
        a, b = b, a
    if a % b == 0:
        return b
    else:
        return gcd(b, a % b)

x, y, a, b = map(int, input().split())
lcm = x * y // gcd(x, y)

for i in range(a, b + 1):
    if i % lcm == 0:
        break

for j in range(b, a - 1, -1):
    if j % lcm == 0:
        break

if j % lcm == 0 and i % lcm == 0:
    print((j - i) // lcm + 1)
else:
    print(0)