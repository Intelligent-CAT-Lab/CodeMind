def f(lst):
    res = []	## res = []
    for i in range(len(lst)):	## i = [] | lst = []
        if lst[i] % 2 == 0:	## lst = [] | i = []
            res.append(lst[i])	## res = [] | lst = [] | i = []

    return lst.copy()	## lst = []
