import math

a, n, m = map(int, input().split())
max = int(math.pow(m, 1/n))
ans = 0
for i in range(1, max+1):
    x = int(math.pow(i, n))
    str = str(x)
    y = 0
    for j in range(len(str)):
        y += int(str[j])
    if y + a == i:
        ans += 1
print(ans)