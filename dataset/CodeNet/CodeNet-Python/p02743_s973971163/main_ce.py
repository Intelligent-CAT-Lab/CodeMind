a,b,c = map(int,"2 3 9".split())
if c-a-b > 0 and (c-a-b)**2-4*a*b>0:
  print('Yes')
else:
  print('No')