def f(dic):
    d = {}	## <state>d = CLRJ</state>
    for key in dic:	## <state>dic = CLRJ</state>
        d[key] = dic.popitem(last = False)[1]
    return d	## <state>d = CLRJ</state>
