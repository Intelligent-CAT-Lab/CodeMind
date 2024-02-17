import math
w,h,c=map(int,"10 20 5".split())
print(int(w*h/math.gcd(w,h)**2*c))
