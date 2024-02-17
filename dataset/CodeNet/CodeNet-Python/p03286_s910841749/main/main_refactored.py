class main:
	n=int(eval(input()))
	if n==0:
	    print((0))
	    exit()
	ans=''
	for i in range(50):
	    if n%(2**(i+1))!=0:
	        n-=(-2)**i
	        ans='1'+ans
	    else:
	        ans='0'+ans
	    if n==0:
	        break
	if ans[0]!='0':
	    print(ans)
	else:
	    print((ans[1:]))
