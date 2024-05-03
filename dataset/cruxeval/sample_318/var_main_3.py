def f(value, char):
    total = 0	## <state>total = CLRJ</state>
    for c in value:	## <state>c = CLRJ | value = CLRJ</state>
        if c == char or c == char.lower():	## <state>c = CLRJ | char = CLRJ</state>
            total += 1	## <state>total = CLRJ</state>
    return total	## <state>total = CLRJ</state>
