L, R, d = map(int, "5 10 2".split())
ans = 0
for i in range(L, R+1):
  if i%d == 0:
    ans += 1
print(ans)