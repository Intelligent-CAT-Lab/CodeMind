def f(text, tab_size):
    res = ''	## res = CLRJ
    text = text.replace('\t', ' '*(tab_size-1))	## text = CLRJ | tab_size = CLRJ
    for i in range(len(text)):	## i = CLRJ | text = CLRJ
        if text[i] == ' ':	## text = CLRJ | i = CLRJ
            res += '|'	## res = CLRJ
        else:
            res += text[i]	## res = CLRJ | text = CLRJ | i = CLRJ
    return res	## res = CLRJ
