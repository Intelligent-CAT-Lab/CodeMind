def f(a, b, c):
    result = {}	## <state>result = CLRJ</state>
    for d in a, b, c:	## <state>d = CLRJ | a = CLRJ | b = CLRJ | c = CLRJ</state>
        result.update(dict.fromkeys(d))	## <state>result = CLRJ | d = CLRJ</state>
    return result	## <state>result = CLRJ</state>
