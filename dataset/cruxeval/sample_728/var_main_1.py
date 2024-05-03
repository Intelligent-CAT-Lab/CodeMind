def f(text):
    result = []	## result = CLRJ
    for i, ch in enumerate(text):	## i = CLRJ | ch = CLRJ | text = CLRJ
        if ch == ch.lower():	## ch = CLRJ
            continue
        if len(text) - 1 - i < text.rindex(ch.lower()):
            result.append(ch)
    return ''.join(result)	## result = CLRJ
