def f(list):
    for i in range(len(list) - 1, 0, -1):	## i = [] | list = []
        for j in range(i):	## j = [] | i = []
            if list[j] > list[j + 1]:	## list = [] | j = []
                list[j], list[j + 1] = list[j + 1], list[j]	## list = [] | j = []
                list.sort()	## list = []
    return list	## list = []
