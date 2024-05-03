def f(dic, key):
    dic = dict(dic)	## dic = CLRJ
    v = dic.pop(key, 0)	## v = CLRJ | dic = CLRJ | key = CLRJ
    if v == 0:	## v = CLRJ
        return 'No such key!'
    while len(dic) > 0:
        dic[dic.popitem()[1]] = dic.popitem()[0]
    return int(dic.popitem()[0])