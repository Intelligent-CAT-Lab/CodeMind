def f(text, sub):
    a = 0	## <state>a = CLRJ</state>
    b = len(text) - 1	## <state>b = CLRJ | text = CLRJ</state>

    while a <= b:	## <state>a = CLRJ | b = CLRJ</state>
        c = (a + b) // 2	## <state>c = CLRJ | a = CLRJ | b = CLRJ</state>
        if text.rfind(sub) >= c:	## <state>text = CLRJ | sub = CLRJ | c = CLRJ</state>
            a = c + 1
        else:
            b = c - 1	## <state>b = CLRJ | c = CLRJ</state>

    return a	## <state>a = CLRJ</state>
