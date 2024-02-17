import math
w,h,c=list(map(int,input().split()))
print((int(w*h/math.gcd(w,h)**2*c)))
