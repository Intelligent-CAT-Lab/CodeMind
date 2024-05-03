def f(text):
    s = text.rpartition('o')	## s = CLRJ | text = CLRJ
    div, div2 = (s[0] == '' and '-' or s[0]), (s[2] == '' and '-' or s[2])	## div = CLRJ | div2 = CLRJ | s = CLRJ
    return s[1] + div + s[1] + div2	## s = CLRJ | div = CLRJ | div2 = CLRJ
