a, b, c, k = [int(i) for i in "2 1 1 3".split()]
ans = 0
if k <= a:
  ans = k
elif k <= (a+b):
  ans = a
else:
  ans = a - (k - (a+b))
print(ans)