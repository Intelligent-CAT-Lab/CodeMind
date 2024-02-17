class main:
	s = sorted(set(eval(input())))
	abc = [chr(i) for i in range(97,97+26)]
	
	for i in abc:
	    if s == abc:
	        print('None')
	        break
	    elif i not in s:
	        print(i)
	        break