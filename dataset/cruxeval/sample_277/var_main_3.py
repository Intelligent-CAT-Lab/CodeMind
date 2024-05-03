def f(lst, mode):
    result = [el for el in lst]	## <state>result = CLRJ | el = CLRJ | lst = CLRJ</state>
    if mode:	## <state>mode = CLRJ</state>
        result.reverse()	## <state>result = CLRJ</state>
    return result	## <state>result = CLRJ</state>
