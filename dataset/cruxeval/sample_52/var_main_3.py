def f(text):
    a = []	## <state>a = CLRJ</state>
    for i in range(len(text)):	## <state>i = CLRJ | text = CLRJ</state>
        if not text[i].isdecimal():	## <state>text = CLRJ | i = CLRJ</state>
            a.append(text[i])	## <state>a = CLRJ | text = CLRJ | i = CLRJ</state>
    return ''.join(a)	## <state>a = CLRJ</state>
