class main:
	s = eval(input())
	
	div = len(s) // 2
	pre = s[:div]
	suf = s[div + 1:]
	
	if s == s[::-1] and pre == pre[::-1] and suf == suf[::-1]:
	    print('Yes')
	else:
	    print('No')
