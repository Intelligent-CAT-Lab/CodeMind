import math
A,B,H,M=map(int,"3 4 9 0".split())
h=30*H+M/2
m=6*M
y=abs(h-m)
x_2=A*A+B*B-2*A*B*(math.cos(math.radians(y)))
x=x_2**(0.5)
print(x)