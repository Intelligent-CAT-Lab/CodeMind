def f(text, pref):
    if text.startswith(pref):	## text = CLRJ | pref = CLRJ
        n = len(pref)	## n = CLRJ | pref = CLRJ
        text = '.'.join(text[n:].split('.')[1:] + text[:n].split('.')[:-1])	## text = CLRJ | n = CLRJ
    return text	## text = CLRJ
