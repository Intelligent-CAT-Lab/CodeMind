import math
a,b = list(map(int,input().split()))
print((a+b-(math.gcd(a,b))+1))
