N,X,T= map(int,"20 12 6".split())
if N%X != 0:
  print((N//X)*T+T)
else:
  print((N//X)*T)