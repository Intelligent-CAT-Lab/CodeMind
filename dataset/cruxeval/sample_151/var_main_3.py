def f(text):
    for c in text:	## <state>c = CLRJ | text = CLRJ</state>
        if c.isdigit():	## <state>c = CLRJ</state>
            if c == '0':	## <state>c = CLRJ</state>
                c = '.'
            else:
                c = '0' if c != '1' else '.'	## <state>c = CLRJ</state>
    return ''.join(list(text)).replace('.', '0')	## <state>text = CLRJ</state>
