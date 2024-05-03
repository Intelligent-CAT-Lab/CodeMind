def f(text):
    rtext = list(text)	## rtext = CLRJ | text = CLRJ
    for i in range(1, len(rtext) - 1):	## i = CLRJ | rtext = CLRJ
        rtext.insert(i + 1, '|')	## rtext = CLRJ | i = CLRJ
    return ''.join(rtext)	## rtext = CLRJ
