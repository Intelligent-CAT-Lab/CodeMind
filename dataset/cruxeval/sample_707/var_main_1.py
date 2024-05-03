def f(text, position):
    length = len(text)	## length = CLRJ | text = CLRJ
    index = position % (length + 1)	## index = CLRJ | position = CLRJ | length = CLRJ
    if position < 0 or index < 0:	## position = CLRJ | index = CLRJ
        index = -1
    new_text = list(text)	## new_text = CLRJ | text = CLRJ
    new_text.pop(index)	## new_text = CLRJ | index = CLRJ
    return ''.join(new_text)	## new_text = CLRJ
