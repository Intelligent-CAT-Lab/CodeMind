def f(strings):
    occurances = {}	## <state>occurances = CLRJ</state>
    for string in strings:	## <state>string = CLRJ | strings = CLRJ</state>
        if string not in occurances:	## <state>string = CLRJ | occurances = CLRJ</state>
            occurances[string] = strings.count(string)	## <state>occurances = CLRJ | string = CLRJ | strings = CLRJ</state>
    return occurances	## <state>occurances = CLRJ</state>
