def f(text):
    for p in ['acs', 'asp', 'scn']:	## p = CLRJ
        text = text.removeprefix(p) + ' '	## text = CLRJ | p = CLRJ
    return text.removeprefix(' ')[:-1]