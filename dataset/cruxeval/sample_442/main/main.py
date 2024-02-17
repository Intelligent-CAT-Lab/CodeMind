def f(lst):
    res = []
    for i in range(len(lst)):
        if lst[i] % 2 == 0:
            res.append(lst[i])

    return lst.copy()