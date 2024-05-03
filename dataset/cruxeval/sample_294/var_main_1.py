def f(n, m, text):
    if text.strip() == '':	## text = CLRJ
        return text
    head, mid, tail = text[0], text[1:-1], text[-1]	## head = CLRJ | mid = CLRJ | tail = CLRJ | text = CLRJ
    joined = head.replace(n, m) + mid.replace(n, m) + tail.replace(n, m)	## joined = CLRJ | head = CLRJ | n = CLRJ | m = CLRJ | mid = CLRJ | tail = CLRJ
    return joined	## joined = CLRJ
