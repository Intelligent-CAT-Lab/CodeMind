def f(text):
    chars = []	## <state>chars = CLRJ</state>
    for c in text:	## <state>c = CLRJ | text = CLRJ</state>
        if c.isdigit():	## <state>c = CLRJ</state>
            chars.append(c)	## <state>chars = CLRJ | c = CLRJ</state>
    return ''.join(chars[::-1])	## <state>chars = CLRJ</state>
