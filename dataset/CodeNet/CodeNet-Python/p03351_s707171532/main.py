a,b,c,x=map(int,input().split())
if abs(a-c)<=x:
  print("Yes")
elif abs(a-b)<=x and abs(b-c)<=x:
  print("Yes")
else:
  print("No")
