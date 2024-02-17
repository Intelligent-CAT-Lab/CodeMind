a,b,c=list(map(int,input().split()))
if abs(a-b)<abs(c-a):
  print('A')
else:
  print('B')