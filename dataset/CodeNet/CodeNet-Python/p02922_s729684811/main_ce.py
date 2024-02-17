import math
a,b = map(int, "4 10".split())
av = a
n = 0
num = 1
while num < b:
  n += 1
  num += av-1
print(n)