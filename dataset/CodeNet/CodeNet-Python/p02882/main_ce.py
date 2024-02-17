a,b,x = map(int,"2 2 4".split())
import math
# ans =math.degrees(math.atan(a*(b**2)/(2*x)))
h = x/a**2
if h>=b/2:
    V = 2*((a**2)*b - x)/a**3
    ans = math.degrees(math.atan(V))
else:
    V=a*(b**2)/(2*x)
    ans =math.degrees(math.atan(V))
print(ans)