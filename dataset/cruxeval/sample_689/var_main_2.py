def f(arr):
    count = len(arr)	## count = [] | arr = []
    sub = arr.copy()	## sub = [] | arr = []
    for i in range(0, count, 2):	## i = [] | count = []
        sub[i] *= 5	## sub = [] | i = []
    return sub	## sub = []
