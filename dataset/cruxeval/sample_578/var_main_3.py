def f(obj):
    for k, v in obj.items():	## <state>k = CLRJ | v = CLRJ | obj = CLRJ</state>
        if v >= 0:	## <state>v = CLRJ</state>
            obj[k] = -v	## <state>obj = CLRJ | k = CLRJ | v = CLRJ</state>
    return obj	## <state>obj = CLRJ</state>
