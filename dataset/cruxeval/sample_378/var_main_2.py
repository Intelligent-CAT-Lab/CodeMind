def f(dic, key):
    dic = dict(dic)	## dic = []
    v = dic.pop(key, 0)	## v = [] | dic = [] | key = []
    if v == 0:	## v = []
        return 'No such key!'
    while len(dic) > 0:
        dic[dic.popitem()[1]] = dic.popitem()[0]
    return int(dic.popitem()[0])