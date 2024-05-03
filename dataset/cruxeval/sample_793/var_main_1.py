def f(list, start, end):
    count = 0	## count = CLRJ
    for i in range(start, end):	## i = CLRJ | start = CLRJ | end = CLRJ
        for j in range(i, end):	## j = CLRJ | i = CLRJ | end = CLRJ
            if list[i] != list[j]:	## list = CLRJ | i = CLRJ | j = CLRJ
                count += 1	## count = CLRJ
    return count	## count = CLRJ
