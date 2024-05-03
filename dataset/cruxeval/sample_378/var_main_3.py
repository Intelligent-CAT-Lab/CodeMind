def f(dic, key):
    dic = dict(dic)	## <state>dic = CLRJ</state>
    v = dic.pop(key, 0)	## <state>v = CLRJ | dic = CLRJ | key = CLRJ</state>
    if v == 0:	## <state>v = CLRJ</state>
        return 'No such key!'
    while len(dic) > 0:
        dic[dic.popitem()[1]] = dic.popitem()[0]
    return int(dic.popitem()[0])