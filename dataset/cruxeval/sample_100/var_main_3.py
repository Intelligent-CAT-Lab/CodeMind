def f(d, rm):
    res = d.copy()	## <state>res = CLRJ | d = CLRJ</state>
    for k in rm:	## <state>k = CLRJ | rm = CLRJ</state>
        if k in res:	## <state>k = CLRJ | res = CLRJ</state>
            del res[k]	## <state>res = CLRJ | k = CLRJ</state>
    return res	## <state>res = CLRJ</state>
