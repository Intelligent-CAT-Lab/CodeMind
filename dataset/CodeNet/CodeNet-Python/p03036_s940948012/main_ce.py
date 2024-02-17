r, d, x = map(int, "2 10 20".split())
for _ in range(10):
  x = r*x - d
  print(x)