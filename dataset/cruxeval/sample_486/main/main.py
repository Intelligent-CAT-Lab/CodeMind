def f(dic):
    dic_op = dic.copy()
    for key, val in list(dic.items()):
        dic_op[key] = val * val
    return dic_op