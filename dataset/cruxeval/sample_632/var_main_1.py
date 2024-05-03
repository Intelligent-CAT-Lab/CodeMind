def f(list):
    for i in range(len(list) - 1, 0, -1):	## i = CLRJ | list = CLRJ
        for j in range(i):	## j = CLRJ | i = CLRJ
            if list[j] > list[j + 1]:	## list = CLRJ | j = CLRJ
                list[j], list[j + 1] = list[j + 1], list[j]	## list = CLRJ | j = CLRJ
                list.sort()	## list = CLRJ
    return list	## list = CLRJ
