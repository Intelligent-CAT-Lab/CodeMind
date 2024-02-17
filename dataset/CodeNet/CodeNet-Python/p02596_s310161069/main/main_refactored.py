class main:
	K = int(eval(input()))
	A = 7%K
	Flag = False
	for T in range(1,K+1):
	    if A==0:
	        Flag = True
	        break
	    else:
	        A = (10*A+7)%K
	print((['-1',T][Flag]))