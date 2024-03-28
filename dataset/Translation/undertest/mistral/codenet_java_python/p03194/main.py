n, p = map(int, input().split())
if n == 1:
    print(p)
    return
res = 1
for i in range(2, int(p ** n) + 1):
    if p % (i ** n) == 0:
        res = i
print(res)