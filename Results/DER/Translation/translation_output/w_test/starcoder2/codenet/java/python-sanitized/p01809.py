/p01809.py
import math

p, q = map(int, input().split())

qs = q
ans = 1
bp = p
bq = q
buf = p

while bq % bp != 0:
    buf = bq % bp
    bq = bp
    bp = buf

qs = q // buf

for i in range(2, int(math.sqrt(qs)
print(ans)
) + 1):
    if qs % i == 0:
        while qs % i == 0:
            qs //= i
        ans *= i

ans *= qs