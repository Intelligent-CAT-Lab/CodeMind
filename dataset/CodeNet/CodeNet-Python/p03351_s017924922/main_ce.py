a, b, c, d = map(int, "4 7 9 3".split())
if abs(a - c) <= d:
  print('Yes')
elif abs(a - b) <= d and abs(b - c) <= d:
  print('Yes')
else:
  print('No')