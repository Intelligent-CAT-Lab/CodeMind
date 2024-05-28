def even_ele(test_tuple, even_fnc): 
	res = tuple() 
	for ele in test_tuple: 
		if isinstance(ele, tuple): 
			res += (even_ele(ele, even_fnc), ) 
		elif even_fnc(ele): 
			res += (ele, ) 
	return res 

test_tuple = (4, 5, (7, 6, (2, 4)), 6, 8)
res = even_ele(test_tuple, lambda x: x % 2 == 0)
print(res)