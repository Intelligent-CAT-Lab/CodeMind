def f(d):
    result = []	## <state>result = CLRJ</state>
    while len(d.keys()) > 0:	## <state>d = CLRJ</state>
        result.append(d.popitem())	## <state>result = CLRJ | d = CLRJ</state>
    return result	## <state>result = CLRJ</state>
