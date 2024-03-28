import math
a,b=map(int,input().split())
a=abs(a-int(input()))
b=abs(b-int(input()))
print(math.gcd(a,b))