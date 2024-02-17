class main:
	L=[26**i for i in range(13)]
	#print(L)
	gun=[sum(L[1:i])for i in range(2,13)]
	#print(gun)
	N=int(eval(input()))
	i=0
	while N > gun[i]:
	  i += 1
	#print(i)
	if i != 0:
	  N = N - gun[i-1] #これを26進法
	N -= 1
	#print(N)
	L=[]
	for k in range(1,i+2):
	   L.append(N//(26**(i+1-k)))
	   N = N % (26**(i+1-k))
	#print(L)
	L=[chr(i+97) for i in L]
	#print(L)
	print((''.join(L)))