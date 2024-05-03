def f(dic):
    dic_op = dic.copy()	## dic_op = [] | dic = []
    for key, val in dic.items():	## key = [] | val = [] | dic = []
        dic_op[key] = val * val	## dic_op = [] | key = [] | val = []
    return dic_op	## dic_op = []
