def p(x):
 for i in range(7,int(x**.5+1),2):
  if x%i==0:return 0
 return 1
def f():
 n,c=map(int,"1 0".split());s='9'*n
 if c<0:return(11,s+s)[n>1]
 for h in'9731':
  if n-1:
   for m in range(int(10**~-n),0,-1):
    m=str(m-1)
    if(sum(int(k)for k in h+m)*2+c)%3:
     t=h+m.zfill(n-1);a=int(t+str(c)+t[::-1])
     if p(a):return a
  else:
   a=int(h+str(c)+h)
   if p(a):return a
print(f())
