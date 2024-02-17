class main:
	s=eval(input())
	n=len(s)
	ans=n
	for i in range(1,n):
	  if s[i-1]==s[i]:
	    continue
	  else:
	    ans=min(ans,max(i,n-i))
	print(ans)