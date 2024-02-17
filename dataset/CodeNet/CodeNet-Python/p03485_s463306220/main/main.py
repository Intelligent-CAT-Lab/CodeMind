import math

a, b = list(map(int, input().split()))
mean = (a+b)/2
ans = math.ceil(mean)

print(ans)