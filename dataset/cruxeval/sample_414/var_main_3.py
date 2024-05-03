def f(d):
    dCopy = d.copy()	## <state>dCopy = CLRJ | d = CLRJ</state>
    for key, value in dCopy.items():	## <state>key = CLRJ | value = CLRJ | dCopy = CLRJ</state>
        for i in range(len(value)):	## <state>i = CLRJ | value = CLRJ</state>
            value[i] = value[i].upper()	## <state>value = CLRJ | i = CLRJ</state>
    return dCopy	## <state>dCopy = CLRJ</state>
