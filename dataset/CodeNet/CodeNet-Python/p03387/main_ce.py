a,b,c=map(int,"2 5 4".split())
x=max(a,b,c)
y=min(a,b,c)
z=a+b+c-x-y
if (z-y)%2==0:
  print(x-z+(z-y)//2)
else:
  print(x-z+1+(z-y+1)//2)