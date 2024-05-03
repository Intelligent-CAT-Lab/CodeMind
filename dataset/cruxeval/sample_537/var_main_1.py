def f(text, value):
    new_text = list(text)	## new_text = CLRJ | text = CLRJ
    try:
        new_text.append(value)	## new_text = CLRJ | value = CLRJ
        length = len(new_text)	## length = CLRJ | new_text = CLRJ
    except IndexError:
        length = 0
    return '[' + str(length) + ']'	## length = CLRJ
