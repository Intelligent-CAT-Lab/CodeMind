def f(full, part):
    length = len(part)	## <state>length = CLRJ | part = CLRJ</state>
    index = full.find(part)	## <state>index = CLRJ | full = CLRJ | part = CLRJ</state>
    count = 0	## <state>count = CLRJ</state>
    while index >= 0:	## <state>index = CLRJ</state>
        full = full[index + length:]	## <state>full = CLRJ | index = CLRJ | length = CLRJ</state>
        index = full.find(part)	## <state>index = CLRJ | full = CLRJ | part = CLRJ</state>
        count += 1	## <state>count = CLRJ</state>
    return count	## <state>count = CLRJ</state>
