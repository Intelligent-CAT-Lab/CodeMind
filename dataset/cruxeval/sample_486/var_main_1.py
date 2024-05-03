def f(dic):
    dic_op = dic.copy()	## dic_op = CLRJ | dic = CLRJ
    for key, val in dic.items():	## key = CLRJ | val = CLRJ | dic = CLRJ
        dic_op[key] = val * val	## dic_op = CLRJ | key = CLRJ | val = CLRJ
    return dic_op	## dic_op = CLRJ
