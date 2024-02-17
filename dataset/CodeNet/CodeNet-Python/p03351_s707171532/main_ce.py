a,b,c,x=map(int,"4 7 9 3".split())
if abs(a-c)<=x:
  print("Yes")
elif abs(a-b)<=x and abs(b-c)<=x:
  print("Yes")
else:
  print("No")
