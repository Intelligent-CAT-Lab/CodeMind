def f(text):
    s = text.lower()	## s = CLRJ | text = CLRJ
    for i in range(len(s)):	## i = CLRJ | s = CLRJ
        if s[i] == 'x':	## s = CLRJ | i = CLRJ
            return 'no'
    return text.isupper()