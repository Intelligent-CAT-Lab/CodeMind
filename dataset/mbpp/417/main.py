def group_tuples(Input): 
	out = {} 
	for elem in Input: 
		try: 
			out[elem[0]].extend(elem[1:]) 
		except KeyError: 
			out[elem[0]] = list(elem) 
	return [tuple(values) for values in out.values()] 