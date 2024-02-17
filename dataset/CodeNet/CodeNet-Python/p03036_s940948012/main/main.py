r, d, x = list(map(int, input().split()))
for _ in range(10):
  x = r*x - d
  print(x)