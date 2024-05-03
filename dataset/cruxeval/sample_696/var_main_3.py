def f(text):
    s = 0	## <state>s = CLRJ</state>
    for i in range(1, len(text)):	## <state>i = CLRJ | text = CLRJ</state>
        s += len(text.rpartition(text[i])[0])	## <state>s = CLRJ | text = CLRJ | i = CLRJ</state>
    return s	## <state>s = CLRJ</state>
