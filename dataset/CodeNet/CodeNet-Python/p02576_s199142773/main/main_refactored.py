class main:
	def MI(): return list(map(int, input().split()))
	N,X,T=MI()
	if N%X!=0:
	  ans=(N//X+1)*T
	else:
	  ans=N//X*T
	print(ans)