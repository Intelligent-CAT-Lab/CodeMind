import math
a,b,n=map(int,"5 7 4".split())
if b<=n+1:
    x=b-1
else:
    x=n
g=math.floor(a*x/b)
print(g)