def f(text, space_symbol, size):
    spaces = ''.join(space_symbol for i in range(size-len(text)))	## spaces = CLRJ | space_symbol = CLRJ | i = CLRJ | size = CLRJ | text = CLRJ
    return text + spaces	## text = CLRJ | spaces = CLRJ
