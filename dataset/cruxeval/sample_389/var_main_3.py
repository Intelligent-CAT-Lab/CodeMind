def f(total, arg):
    if type(arg) is list:	## <state>arg = CLRJ</state>
        for e in arg:
            total.extend(e)
    else:
        total.extend(arg)	## <state>total = CLRJ | arg = CLRJ</state>
    return total	## <state>total = CLRJ</state>
