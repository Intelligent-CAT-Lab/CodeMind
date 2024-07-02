def find_lists(Input): 
	if isinstance(Input, list): 
		return 1
	else: 
		return len(Input) 
find_lists(([1, 2, 3, 4], [5, 6, 7, 8]))