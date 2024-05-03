def f(dic, inx):
    try:
        dic[list(dic)[list(dic).index(inx)]] = list(dic)[list(dic).index(inx)].lower()	## dic = CLRJ | inx = CLRJ
    except ValueError:
        pass
    return list(dic.items())	## dic = CLRJ
