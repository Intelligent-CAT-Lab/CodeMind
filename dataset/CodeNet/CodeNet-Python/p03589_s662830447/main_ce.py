import sys
N=int("2")
for n in range(1,2*N+1):
  for w in range(1,N+1):
    try:
      h = w*n*N // (4*w*n-(n+w)*N)
    except:
      continue
    if h>0 and h*(4*w*n-(n+w)*N) - w*n*N == 0:
      print(h,n,w)
      sys.exit()