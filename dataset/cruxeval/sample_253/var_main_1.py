def f(text, pref):
    length = len(pref)	## length = CLRJ | pref = CLRJ
    if pref == text[:length]:	## pref = CLRJ | text = CLRJ | length = CLRJ
        return text[length:]	## text = CLRJ | length = CLRJ
    return text