def f(val, text):
    indices = [index for index in range(len(text)) if text[index] == val]	## indices = CLRJ | index = CLRJ | text = CLRJ | val = CLRJ
    if len(indices) == 0:	## indices = CLRJ
        return -1
    else:
        return indices[0]