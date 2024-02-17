a, b, c = map(int,"2 3 3".split())
if a > c:
  print(a-c, b)
elif a + b < c:
  print(0,0)
else:
  print(0,a+b-c)