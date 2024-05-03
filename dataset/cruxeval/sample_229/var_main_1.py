def f(dic, value):
    result = []	## result = CLRJ
    for e in dic:	## e = CLRJ | dic = CLRJ
        result.append(e[0])	## result = CLRJ | e = CLRJ
        if e[1] == value:	## e = CLRJ | value = CLRJ
            result.reverse()
        else:
            result.append(e[1])	## result = CLRJ | e = CLRJ
    return result	## result = CLRJ
