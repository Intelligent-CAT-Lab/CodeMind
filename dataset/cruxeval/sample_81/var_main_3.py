def f(dic, inx):
    try:
        dic[list(dic)[list(dic).index(inx)]] = list(dic)[list(dic).index(inx)].lower()	## <state>dic = CLRJ | inx = CLRJ</state>
    except ValueError:
        pass
    return list(dic.items())	## <state>dic = CLRJ</state>
