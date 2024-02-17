import math
x = int(eval(input()))
k = 0
t = 0

if (math.sqrt(8 * x + 1) == math.floor(math.sqrt(8 * x + 1))):
  a = (-1 + math.sqrt(1 + 8 * x))/2
  print((int(a)))
else:
  x = (-1 + math.sqrt(1 + 8 * x))//2
  print((int(x) + 1))
