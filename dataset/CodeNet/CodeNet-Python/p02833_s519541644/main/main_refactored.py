class main:
	N=int(eval(input()))
	if int(N)%2==1:
	  print((0))
	  exit()
	ans=0
	N//=2
	for i in range(1,1000):
	  ans+=N//(5**i)
	  if N<5**i:
	    print(ans)
	    exit()
	  