def f(text, delimiter):
    text = text.rpartition(delimiter)	## text = CLRJ | delimiter = CLRJ
    return text[0] + text[-1]	## text = CLRJ
