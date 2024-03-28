import math

x, y, a, b = map(int, input().split())

lcm = x * y // math.gcd(x, y)

i = a
while i <= b:
    if i % lcm == 0:
        break
    i += 1

j = b
while j >= a:
    if j % lcm == 0:
        break
    j -= 1

if j % lcm == 0 and i % lcm == 0:
    print((j - i) // lcm + 1)
else:
    print(0)