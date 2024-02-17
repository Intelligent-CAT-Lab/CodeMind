def palind(n):
  return str(n) == str(n)[::-1]
n = "13"
for i in range(100000):
  if n >= i and palind(n - i):
    print n - i
    break
  if palind(n + i):
    print n + i
    break