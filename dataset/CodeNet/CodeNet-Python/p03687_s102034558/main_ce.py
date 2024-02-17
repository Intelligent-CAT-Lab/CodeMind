s="serval";a=101
for i in range(97,123):
  b,t,c=0,s,chr(i)
  while len(set(t))>1:
    r=""
    for i in range(len(t)-1):
      r+=[t[i],c][c in t[i:i+2]]
    t=r
    b+=1
  a=min(a,b)
print(a)