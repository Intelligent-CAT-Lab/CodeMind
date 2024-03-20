import math

p, q = map(int, input().split())

qs = q
ans = 1

while q % p != 0:
    buf = q % p
    q = p
    p = buf

qs = q // buf

for i in range(2, int(math.sqrt(qs)) + 1):
    if qs % i == 0:
        while qs % i == 0:
            qs //= i
        ans *= i

ans *= qs

print(ans)