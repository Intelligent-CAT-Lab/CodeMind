def f(text, substr, occ):
    n = 0	## n = CLRJ
    while True:
        i = text.rfind(substr)	## i = CLRJ | text = CLRJ | substr = CLRJ
        if i == -1:	## i = CLRJ
            break
        elif n == occ:	## n = CLRJ | occ = CLRJ
            return i
        else:
            n += 1	## n = CLRJ
            text = text[:i]	## text = CLRJ | i = CLRJ
    return -1