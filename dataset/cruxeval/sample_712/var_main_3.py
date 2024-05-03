def f(text):
    created = []	## <state>created = CLRJ</state>
    for line in text.splitlines():	## <state>line = CLRJ | text = CLRJ</state>
        if line == '':	## <state>line = CLRJ</state>
            break
        created.append(list(list(line.rstrip())[::-1][flush]))	## <state>created = CLRJ | line = CLRJ</state>
    return created[::-1]	## <state>created = CLRJ</state>

flush = 0