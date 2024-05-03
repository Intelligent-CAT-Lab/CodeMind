def f(list, start, end):
    count = 0	## count = []
    for i in range(start, end):	## i = [] | start = [] | end = []
        for j in range(i, end):	## j = [] | i = [] | end = []
            if list[i] != list[j]:	## list = [] | i = [] | j = []
                count += 1	## count = []
    return count	## count = []
