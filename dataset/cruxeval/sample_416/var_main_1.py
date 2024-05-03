def f(text, old, new):
    index = text.rfind(old, 0, text.find(old))	## index = CLRJ | text = CLRJ | old = CLRJ
    result = list(text)	## result = CLRJ | text = CLRJ
    while index > 0:	## index = CLRJ
        result[index:index+len(old)] = new
        index = text.rfind(old, 0, index)
    return ''.join(result)	## result = CLRJ
