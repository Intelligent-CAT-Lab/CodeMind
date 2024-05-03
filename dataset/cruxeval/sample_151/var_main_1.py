def f(text):
    for c in text:	## c = CLRJ | text = CLRJ
        if c.isdigit():	## c = CLRJ
            if c == '0':	## c = CLRJ
                c = '.'
            else:
                c = '0' if c != '1' else '.'	## c = CLRJ
    return ''.join(list(text)).replace('.', '0')	## text = CLRJ
