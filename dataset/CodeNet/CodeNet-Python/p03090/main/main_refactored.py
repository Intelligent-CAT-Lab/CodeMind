class main:
	N = int(eval(input()))
	
	if N % 2 == 0:
	    edge = []
	    for s in range(1, N + 1):
	        ng = N - s + 1
	        for t in range(1, N + 1):
	            if s >= t or t == ng:
	                continue
	            edge.append((s, t))
	else:
	    edge = []
	    for s in range(1, N + 1):
	        ng = N - s
	        for t in range(1, N + 1):
	            if s >= t or t == ng:
	                continue
	            edge.append((s, t))
	
	print((len(edge)))
	for s, t in edge:
	    print((s, t))