n = int(eval(input()))

c = 0

for i in range(1, n):
  c += (n - 1) // i

print(c)