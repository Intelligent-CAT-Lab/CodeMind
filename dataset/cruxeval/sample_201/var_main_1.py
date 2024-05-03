def f(text):
    chars = []	## chars = CLRJ
    for c in text:	## c = CLRJ | text = CLRJ
        if c.isdigit():	## c = CLRJ
            chars.append(c)	## chars = CLRJ | c = CLRJ
    return ''.join(chars[::-1])	## chars = CLRJ
