import math
a,b = map(int,"4 4".split())
print(a+b-(math.gcd(a,b))+1)
