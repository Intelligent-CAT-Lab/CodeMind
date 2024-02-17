class main:
	s = eval(input())
	print(((s[0]=='A')+sum(s[i] >= s[i+1] for i in range(len(s)-1))))