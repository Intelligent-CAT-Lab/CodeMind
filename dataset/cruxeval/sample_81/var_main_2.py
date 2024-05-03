def f(dic, inx):
    try:
        dic[list(dic)[list(dic).index(inx)]] = list(dic)[list(dic).index(inx)].lower()	## dic = [] | inx = []
    except ValueError:
        pass
    return list(dic.items())	## dic = []
