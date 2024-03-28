import math

n = int(input())

if n == 1:
    print(0)
    exit()

pMap = {}
for i in range(2, int(math.sqrt(n))):
    count = 0
    while n % i == 0:
        count += 1
        n //= i
    if count > 0:
        pMap[i] = count

if n != 1:
    pMap[n] = 1

ans = 0
for pCount in pMap.values():
    i = 1
    while pCount >= i:
        pCount -= i
        ans += 1
        i += 1

print(ans)


Upvotes: 0