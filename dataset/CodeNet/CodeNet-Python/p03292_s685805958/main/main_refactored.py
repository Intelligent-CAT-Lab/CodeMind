class main:
	import numpy as np
	A = np.array(sorted(map(int, input().split())))
	print(((A[1:] - A[:-1]).sum()))
