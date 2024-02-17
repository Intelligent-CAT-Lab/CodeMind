class main:
	S = eval(input())
	
	lst = [S[:7]]
	for i in range(7):
	    temp = S[:i] + S[-7 + i:]
	    lst.append(temp)
	#print(lst)
	if 'keyence' in lst:
	    print('YES')
	else:
	    print('NO')
