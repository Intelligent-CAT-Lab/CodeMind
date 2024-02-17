class main:
	S = eval(input())
	
	
	dict_string = {}
	dict_depth = {}
	
	for s in S:
	    if s in dict_string:
	        dict_string[s] += 1
	    else:
	        dict_string[s] = 1
	        dict_depth[s] = 0
	
	
	dict_string_calc = dict_string.copy()
	
	
	while len(dict_string_calc) != 1:
	    x = None
	    y = None
	
	    for k, v in sorted(list(dict_string_calc.items()), key=lambda x: x[1]):
	        if x == None:
	            x = k
	            x_cnt = v
	            continue
	
	        if y == None:
	            y = k
	            y_cnt = v
	            break
	
	    for s in (x + y):
	        if s in dict_depth:
	            dict_depth[s] += 1
	        else:
	            raise
	
	    del dict_string_calc[x]
	    del dict_string_calc[y]
	
	    dict_string_calc[x + y] = x_cnt + y_cnt
	
	
	ans = 0
	
	for k, v in list(dict_depth.items()):
	    ans += dict_string[k] * v
	
	
	if len(dict_string) == 1:
	    ans = len(S)
	
	print(ans)
