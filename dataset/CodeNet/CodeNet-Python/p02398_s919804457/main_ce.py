a, b, c = map(int, "5 14 80".split())
d = 0
for i in range(a, b+1):
  if c % i == 0:
    d += 1
print(d)
