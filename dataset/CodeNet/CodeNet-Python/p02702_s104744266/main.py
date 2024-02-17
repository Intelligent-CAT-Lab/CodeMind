from collections import defaultdict
d = defaultdict(int)
S=input()
S=S[::-1]
i=1
x=0
MOD=2019
for s in S:
  x+=(int(s)*i)%MOD
  x%=MOD
  d[x]+=1
  i*=10
  i%=MOD
ans=0
for k in d.values():
  ans=ans+k*(k-1)//2
print(ans+d[0])