def f(dic):
    d = {}
    for key in dic:
        d[key] = dic.popitem(last = False)[1]
    return d