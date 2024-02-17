from math import sqrt
mod=10**9+7
a,b,c=list(map(int, "2 3 9".split()))
#if sqrt(a)+sqrt(b)<sqrt(c):
if 4*a*b<(c-a-b)**2 and c-a-b>0:
  print("Yes")
else:
  print("No")
