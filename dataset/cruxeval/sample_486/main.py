def f(dic):
    dic_op = dic.copy()
    for key, val in dic.items():
        dic_op[key] = val * val
    return dic_op