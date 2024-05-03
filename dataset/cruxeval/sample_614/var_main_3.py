def f(text, substr, occ):
    n = 0	## <state>n = CLRJ</state>
    while True:
        i = text.rfind(substr)	## <state>i = CLRJ | text = CLRJ | substr = CLRJ</state>
        if i == -1:	## <state>i = CLRJ</state>
            break
        elif n == occ:	## <state>n = CLRJ | occ = CLRJ</state>
            return i
        else:
            n += 1	## <state>n = CLRJ</state>
            text = text[:i]	## <state>text = CLRJ | i = CLRJ</state>
    return -1