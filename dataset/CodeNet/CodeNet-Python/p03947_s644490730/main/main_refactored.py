class main:
	s=input()
	now=s[0]
	ans=0
	for i in range(1,len(s)):
	    if now!=s[i]:
	        ans+=1
	        now=s[i]
	print(ans)
