n = int(input())
ans = 0
for x in (25, 10, 5, 1):
  ans += n // x
  n %= x
print(ans)
