def f(items):
    result = []	## <state>result = CLRJ</state>
    for item in items:	## <state>item = CLRJ | items = CLRJ</state>
        for d in item:	## <state>d = CLRJ | item = CLRJ</state>
            if not d.isdigit():	## <state>d = CLRJ</state>
                result.append(d)	## <state>result = CLRJ | d = CLRJ</state>
    return result	## <state>result = CLRJ</state>
