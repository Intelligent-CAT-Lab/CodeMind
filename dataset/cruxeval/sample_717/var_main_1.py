def f(text):
    (k, l) = (0, len(text) - 1)	## k = CLRJ | l = CLRJ | text = CLRJ
    while not text[l].isalpha():	## text = CLRJ | l = CLRJ
        l -= 1
    while not text[k].isalpha():	## text = CLRJ | k = CLRJ
        k += 1
    if k != 0 or l != len(text) - 1:	## k = CLRJ | l = CLRJ | text = CLRJ
        return text[k: l+1]
    else:
        return text[0]	## text = CLRJ
