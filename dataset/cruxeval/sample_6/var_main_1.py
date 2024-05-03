def f(dic):
    for k,v in sorted(dic.items(), key=lambda x: len(str(x)))[:-1]:	## k = CLRJ | v = CLRJ | dic = CLRJ | x = CLRJ
        dic.pop(k)	## dic = CLRJ | k = CLRJ
    return list(dic.items())	## dic = CLRJ
