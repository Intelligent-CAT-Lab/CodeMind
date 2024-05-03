def f(dic, value):
    result = []	## <state>result = CLRJ</state>
    for e in dic:	## <state>e = CLRJ | dic = CLRJ</state>
        result.append(e[0])	## <state>result = CLRJ | e = CLRJ</state>
        if e[1] == value:	## <state>e = CLRJ | value = CLRJ</state>
            result.reverse()
        else:
            result.append(e[1])	## <state>result = CLRJ | e = CLRJ</state>
    return result	## <state>result = CLRJ</state>
