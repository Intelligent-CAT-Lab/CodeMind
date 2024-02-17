import math
a,h,x = [int(j) for j in input().split()]
# y = (h*a - x/a)*(2/a**2)
# y = a**2/(2*h*a-2*x)
y = 2*h/a - 2*x/a**3
z = (h**2)*a/(2*x)
# try:
# print(y)
b = x/(a**2)
if b>h/2:
    print((math.degrees(math.atan(y))))
else:
    print((math.degrees(math.atan(z))))