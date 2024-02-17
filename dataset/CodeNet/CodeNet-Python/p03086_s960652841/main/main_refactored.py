class main:
	import re
	
	S = eval(input())
	
	splitted = re.split("[^ATGC]", S)
	
	max_length = 0
	for inv in splitted:
	    max_length = max(max_length, len(inv))
	
	print(max_length)
