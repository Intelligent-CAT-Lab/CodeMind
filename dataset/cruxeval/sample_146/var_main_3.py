def f(single_digit):
    result = []	## <state>result = CLRJ</state>
    for c in range(1, 11):	## <state>c = CLRJ</state>
        if c != single_digit:	## <state>c = CLRJ | single_digit = CLRJ</state>
            result.append(c)	## <state>result = CLRJ | c = CLRJ</state>
    return result	## <state>result = CLRJ</state>
