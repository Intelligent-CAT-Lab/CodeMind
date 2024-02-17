x,a,b=map(int,"4 3 6".split())
if b<=a:
  print('delicious')
elif (b-a)<=x:
  print('safe')
else:
  print('dangerous')