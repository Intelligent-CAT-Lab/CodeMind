def f(text, pref):
    if isinstance(pref, list):	## pref = CLRJ
        return ', '.join(text.startswith(x) for x in pref)
    else:
        return text.startswith(pref)	## text = CLRJ | pref = CLRJ
