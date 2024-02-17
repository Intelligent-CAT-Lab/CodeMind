class main:
	s=eval(input())
	a=[]
	ans="yes"
	for i in range(len(s)):
	  if not(s[i] in a):
	    a.append(s[i])
	  else:
	    ans="no"
	    break
	print(ans)