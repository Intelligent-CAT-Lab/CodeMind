class main:
	s = input()
	p = "ABC"
	used = set()
	
	while s != p:
	    idx = 0
	    c = [0]*3
	    while idx < len(s):
	        if idx+3 <= len(s) and s[idx:idx+3] == p:
	            idx += 3
	        else:
	            c[p.index(s[idx])] += 1
	            idx += 1
	    if sum(e == 0 for e in c) != 1 or sum(c) == len(s):
	        print("No")
	        exit(0)
	    s = s.replace("ABC", p[[i for i in [0,1,2] if c[i]==0][0]])
	print("Yes")