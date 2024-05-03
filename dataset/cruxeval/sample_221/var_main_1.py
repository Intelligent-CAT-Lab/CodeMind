def f(text, delim):
    first, second = text.split(delim)	## first = CLRJ | second = CLRJ | text = CLRJ | delim = CLRJ
    return second + delim + first	## second = CLRJ | delim = CLRJ | first = CLRJ
