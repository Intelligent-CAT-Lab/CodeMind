def f(dic):
    d = {}	## d = []
    for key in dic:	## dic = []
        d[key] = dic.popitem(last = False)[1]
    return d	## d = []
