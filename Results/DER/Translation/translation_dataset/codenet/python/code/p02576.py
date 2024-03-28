N,X,T= map(int,input().split())
if N%X != 0:
  print((N//X)*T+T)
else:
  print((N//X)*T)