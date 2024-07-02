def f(dic):
    dic_op = dic.copy()
    for key, val in dic.items():
        dic_op[key] = val * val
    return dic_op
f({1:1, 2:2, 3:3})