def f(text, elem):
    if elem != '':	## elem = CLRJ
        while text.startswith(elem):	## text = CLRJ | elem = CLRJ
            text = text.replace(elem, '')
        while elem.startswith(text):	## elem = CLRJ | text = CLRJ
            elem = elem.replace(text, '')
    return [elem, text]	## elem = CLRJ | text = CLRJ
