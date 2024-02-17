import math
a, b, x = map(int, "2 2 4".split())
c = x/a
if c > a*b/2:
  c = a*b - c
  d = c*2 / a
  e = math.atan(d/a)
else:
  d = c*2 / b
  e = math.atan(b/d)
print(math.degrees(e))