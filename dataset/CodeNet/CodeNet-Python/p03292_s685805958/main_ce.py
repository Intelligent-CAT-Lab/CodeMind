import numpy as np
A = np.array(sorted(map(int, "1 6 3".split())))
print((A[1:] - A[:-1]).sum())
