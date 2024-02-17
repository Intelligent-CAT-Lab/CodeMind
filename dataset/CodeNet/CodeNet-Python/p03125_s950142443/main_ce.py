a = list(map(int, "4 12".split()))
if a[1] % a[0] == 0:
  b = a[0] + a[1]
if a[1] % a[0] != 0:
  b = a[1] - a[0]
print(b)