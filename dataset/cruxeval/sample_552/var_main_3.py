def f(d):
    result = {}	## <state>result = CLRJ</state>
    for k, v in d.items():	## <state>k = CLRJ | v = CLRJ | d = CLRJ</state>
        if isinstance(k, float):	## <state>k = CLRJ</state>
            for i in v:
                result[i] = k
        else:
            result[k] = v	## <state>result = CLRJ | k = CLRJ | v = CLRJ</state>
    return result	## <state>result = CLRJ</state>
