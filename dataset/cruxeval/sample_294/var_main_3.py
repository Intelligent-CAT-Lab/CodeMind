def f(n, m, text):
    if text.strip() == '':	## <state>text = CLRJ</state>
        return text
    head, mid, tail = text[0], text[1:-1], text[-1]	## <state>head = CLRJ | mid = CLRJ | tail = CLRJ | text = CLRJ</state>
    joined = head.replace(n, m) + mid.replace(n, m) + tail.replace(n, m)	## <state>joined = CLRJ | head = CLRJ | n = CLRJ | m = CLRJ | mid = CLRJ | tail = CLRJ</state>
    return joined	## <state>joined = CLRJ</state>
