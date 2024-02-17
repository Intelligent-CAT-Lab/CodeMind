import math

a, b, x = list(map(int, input().split()))
c = x/a
if c > a*b/2:
  c = a*b - c
  d = c*2 / a
  e = math.atan(d/a)
else:
  d = c*2 / b
  e = math.atan(b/d)
print((math.degrees(e)))