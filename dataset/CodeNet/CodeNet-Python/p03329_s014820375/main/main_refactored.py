class main:
	n=int(eval(input()))
	nl=[9**i for i in range(1,6)][::-1]
	sl=[6**i for i in range(1,7)][::-1]
	tl=[]
	for i in range(n+1):
	    totals=0
	    ps=i
	    for j in sl:
	        if ps >= j:
	            totals+=ps//j
	            ps= ps-ps//j*j
	    totaln=0
	    pn=n-i
	    for k in nl:
	        if pn >=k:
	            totaln+= pn //k
	            pn=pn-pn//k*k
	    tl.append(totals+totaln+ps+pn)
	print((min(tl)))
