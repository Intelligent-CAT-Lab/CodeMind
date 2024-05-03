def f(text):
    a = 0	## <state>a = CLRJ</state>
    if text[0] in text[1:]:	## <state>text = CLRJ</state>
        a += 1	## <state>a = CLRJ</state>
    for i in range(0, len(text)-1):	## <state>i = CLRJ | text = CLRJ</state>
        if text[i] in text[i+1:]:	## <state>text = CLRJ | i = CLRJ</state>
            a += 1	## <state>a = CLRJ</state>
    return a	## <state>a = CLRJ</state>
