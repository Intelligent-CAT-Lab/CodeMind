class main:
	s=list(eval(input()))
	c=1
	n=''
	k=s[0]
	for i in range(1,len(s)):
	    n+=s[i]
	    if k!=n:
	        k=n
	        n=''
	        c+=1
	print(c)