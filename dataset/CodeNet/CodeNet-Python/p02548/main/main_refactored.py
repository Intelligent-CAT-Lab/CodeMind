class main:
	n = int(eval(input()))
	
	cnt = 0
	for a in range(1, n):
	    for b in range(1, n):
	        x = a * b
	        if x >= n:
	            break
	        cnt += 1
	
	print(cnt)            
