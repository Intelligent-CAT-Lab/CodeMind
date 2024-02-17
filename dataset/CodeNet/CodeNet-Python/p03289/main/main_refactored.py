class main:
	S = eval(input())
	
	flag = 0
	if S[0] != "A":
	    flag = 1
	    
	count = 0
	for i in range(2,len(S)-1):
	    if S[i] == "C":
	        count += 1
	if count != 1:
	    flag = 1
	
	count2 = 0
	for i in S:
	    if i == i.upper():
	        count2 += 1
	if count2 != 2:
	    flag = 1
	    
	if flag == 0:
	    print("AC")
	else:
	    print("WA")