def f(array):
    d = dict(array)	## <state>d = CLRJ | array = CLRJ</state>
    for key, value in d.items():	## <state>key = CLRJ | value = CLRJ | d = CLRJ</state>
        if value < 0 or value > 9:	## <state>value = CLRJ</state>
            return None
    return d	## <state>d = CLRJ</state>
