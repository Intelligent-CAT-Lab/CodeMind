class main:
	N=int(eval(input()))
	def function(a,b):
	    return max(len(str(a)), len(str(b)))
	mini=len(str(N))
	lim=len(str(int(N**(0.5))))
	for i in range(2,int(N**(0.5)+1)):
	    if mini==lim:
	        break
	    if N%i==0:
	        if mini>function(i,N//i):
	            mini=function(i,N//i)
	print(mini)
