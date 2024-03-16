import math

N = int(input())
D = int(input())

ans = math.ceil(N / (D * 2 + 1))
print(ans)