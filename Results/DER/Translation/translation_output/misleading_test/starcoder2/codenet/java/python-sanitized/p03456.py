import math
s,t = input().split()
mah = s+t
a = int(mah)
b = int(math.sqrt(a))
if b*b == a:
    print("Yes")
else:
    print("No")