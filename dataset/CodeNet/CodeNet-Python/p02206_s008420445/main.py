n,k=map(int,input().split())
l,r=0,k+1
while r-l>1:
  m=(l+r)//2
  res = m
  t = m
  for i in range(n-1):
    t //= 2
    res += t
    if t == 0:
      break
  if res > k:
    r = m
  else:
    l = m
print(l)
