class main:
	n=int(eval(input()))
	p=0
	t=True
	while p<26:
	    r=n-(7*p)
	    if r>=0 and r%4 ==0:
	        t=False
	        print("Yes")
	        break
	    p+=1
	if t:
	    print("No")
