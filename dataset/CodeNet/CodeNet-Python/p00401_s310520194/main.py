n = int(input())
ret = 1
i = 0
while ret <= n:
    ret = 2**i
    i += 1
print(ret//2)
