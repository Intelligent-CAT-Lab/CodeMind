def f(s):
    count = 0	## <state>count = CLRJ</state>
    digits = ""	## <state>digits = CLRJ</state>
    for c in s:	## <state>c = CLRJ | s = CLRJ</state>
        if c.isdigit():	## <state>c = CLRJ</state>
            count += 1	## <state>count = CLRJ</state>
            digits += c	## <state>digits = CLRJ | c = CLRJ</state>
    return [digits, count]	## <state>digits = CLRJ | count = CLRJ</state>
