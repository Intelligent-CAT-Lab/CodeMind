def MI(): return map(int, "20 12 6".split())
N,X,T=MI()
if N%X!=0:
  ans=(N//X+1)*T
else:
  ans=N//X*T
print(ans)