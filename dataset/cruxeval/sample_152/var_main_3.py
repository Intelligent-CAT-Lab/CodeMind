def f(text):
    n = 0	## <state>n = CLRJ</state>
    for char in text:	## <state>char = CLRJ | text = CLRJ</state>
        if char.isupper():	## <state>char = CLRJ</state>
            n += 1	## <state>n = CLRJ</state>
    return n	## <state>n = CLRJ</state>
