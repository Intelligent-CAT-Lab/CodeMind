def f(text, sign):
    length = len(text)	## length = CLRJ | text = CLRJ
    new_text = list(text)	## new_text = CLRJ | text = CLRJ
    sign = list(sign)	## sign = CLRJ
    for i in range(len(sign)):	## i = CLRJ | sign = CLRJ
        new_text.insert((i * length - 1) // 2 + (i + 1) // 2, sign[i])	## new_text = CLRJ | i = CLRJ | length = CLRJ | sign = CLRJ
    return ''.join(new_text)	## new_text = CLRJ
