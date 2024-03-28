import math

s = input()
t = input()

mah = s + t
a = int(mah)
b = math.sqrt(a)

if b * b == a:
    print("Yes")
else:
    print("No")