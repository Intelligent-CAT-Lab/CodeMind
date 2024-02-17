class main:
	
	S = eval(input())
	n = 0
	ans = 0
	
	for i in S:
	    if i == "(":
	        n += 1
	    elif i == ")":
	        n -= 1
	    else:
	        print (n)
	        break
	
	
