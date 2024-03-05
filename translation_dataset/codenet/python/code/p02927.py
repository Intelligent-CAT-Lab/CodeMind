m,d = map(int,input().split())
ans = 0
for i in range(22,d+1):
  d0 = i%10
  d1 = int(i/10)
  if d0 == 1 or d0 == 0:
    continue
  if m >= d0 * d1:
    ans += 1
    #print(i)
print(ans)