x, y = map(int, "54 20".split())
if x > y:
  x, y = y, x
while x % y != 0:
  x, y = y, x % y
print(y)
