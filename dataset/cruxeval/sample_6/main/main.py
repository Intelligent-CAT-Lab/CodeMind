def f(dic):
    for k,v in sorted(list(dic.items()), key=lambda x: len(str(x)))[:-1]:
        dic.pop(k)
    return list(dic.items())