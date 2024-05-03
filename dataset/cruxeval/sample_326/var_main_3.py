def f(text):
    number = 0	## <state>number = CLRJ</state>
    for t in text:	## <state>t = CLRJ | text = CLRJ</state>
        if t.isnumeric():	## <state>t = CLRJ</state>
            number += 1
    return number	## <state>number = CLRJ</state>
