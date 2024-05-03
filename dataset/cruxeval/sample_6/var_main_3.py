def f(dic):
    for k,v in sorted(dic.items(), key=lambda x: len(str(x)))[:-1]:	## <state>k = CLRJ | v = CLRJ | dic = CLRJ | x = CLRJ</state>
        dic.pop(k)	## <state>dic = CLRJ | k = CLRJ</state>
    return list(dic.items())	## <state>dic = CLRJ</state>
