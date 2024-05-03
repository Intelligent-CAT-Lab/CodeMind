def f(dic):
    d = {}	## d = CLRJ
    for key in dic:	## dic = CLRJ
        d[key] = dic.popitem(last = False)[1]
    return d	## d = CLRJ
