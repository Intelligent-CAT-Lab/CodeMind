import math
n=int(input())
s=math.factorial(n)
ans=s%(10**9+7)
print(ans)