n,k = list(map(int, input().split()))
i = 0

while n//k**i != 0:
    i += 1

print(i)
