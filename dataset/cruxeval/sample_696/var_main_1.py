def f(text):
    s = 0	## s = CLRJ
    for i in range(1, len(text)):	## i = CLRJ | text = CLRJ
        s += len(text.rpartition(text[i])[0])	## s = CLRJ | text = CLRJ | i = CLRJ
    return s	## s = CLRJ
