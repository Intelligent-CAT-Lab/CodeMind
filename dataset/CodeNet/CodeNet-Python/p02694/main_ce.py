import math
x = int("103")
y = 100
ans = 0
while y < x:
    ans += 1
    y = math.floor(y*1.01)
print(ans)