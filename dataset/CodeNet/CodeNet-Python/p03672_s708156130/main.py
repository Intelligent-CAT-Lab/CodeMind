s=input()
n=len(s)
for i in range(1,int(n/2)):
  d=int(n/2)-i
  s=s[:-2]
  if s==s[:d]*2:
    print(2*d)
    break