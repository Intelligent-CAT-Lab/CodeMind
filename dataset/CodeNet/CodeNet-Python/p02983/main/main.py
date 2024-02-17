L, R = list(map(int, input().split()))
if R - L > 2019:
  print((0))
else:
  l = []
  for i in range(L, R + 1):
    for j in range(i + 1, R + 1):
      l.append(i * j % 2019)
  print((min(l)))