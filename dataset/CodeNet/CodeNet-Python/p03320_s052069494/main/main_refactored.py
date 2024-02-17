class main:
	LEN = 0
	
	SNK = [1,2,3,4,5,6,7,8,9]
	#SNK.append("SUNUKE!:"+str(1))
	LEN +=1
	
	for i in range(1,10): SNK.append(i*10+9)
	#SNK.append("SUNUKE!:"+str(2))
	LEN +=1
	
	#for i in range(1,10): SNK.append(i*100+99)
	#SNK.append("SUNUKE!:"+str(3))
	LEN +=1
	
	for loop in range(2):
	    SNK_sub = list(range(pow(10,loop),pow(10,loop+1)))
	    SNK += list([(x*pow(10,LEN-1))+(pow(10,LEN-1)-1) for x in SNK_sub])
	    LEN += len(str(max(SNK_sub)))-1
	    for d in SNK_sub: #loop=0のとき，d=1-9
	        SNK += [(i*pow(10,LEN-1))+(pow(10,LEN-1)-1) for i in range(10,10*(d+1))]
	        SNK += list([(x*pow(10,LEN))+(pow(10,LEN)-1) for x in SNK_sub[SNK_sub.index(d)+1:]])
	        #SNK.append("SUNUKE!:"+str(LEN+3))
	        LEN += 1+loop
	        if LEN>20:break
	
	print(("\n".join(str(i) for i in SNK[:int(eval(input()))])))