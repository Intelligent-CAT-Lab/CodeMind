n=int(input())
a = [i for i in range(n+1)]
res=0
time = 0
for i in range(1,n+1):
  cnt = n // a[i]
  res += a[i]*cnt*(cnt+1)//2
  #print(res)

print(res)