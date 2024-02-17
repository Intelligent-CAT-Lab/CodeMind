a, b, c = list(map(int, input().split()))
d = 0
for i in range(a, b+1):
  if c % i == 0:
    d += 1
print(d)
