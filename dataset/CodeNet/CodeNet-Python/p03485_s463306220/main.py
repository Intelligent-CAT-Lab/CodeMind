import math

a, b = map(int, input().split())
mean = (a+b)/2
ans = math.ceil(mean)

print(ans)