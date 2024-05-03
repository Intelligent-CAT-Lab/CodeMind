def f(string):
    upper = 0	## <state>upper = CLRJ</state>
    for c in string:	## <state>c = CLRJ | string = CLRJ</state>
        if c.isupper():	## <state>c = CLRJ</state>
            upper += 1	## <state>upper = CLRJ</state>
    return upper * (2,1)[upper % 2]	## <state>upper = CLRJ</state>
