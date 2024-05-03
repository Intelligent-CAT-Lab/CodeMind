def f(s, from_c, to_c):
    table = s.maketrans(from_c, to_c)	## table = CLRJ | s = CLRJ | from_c = CLRJ | to_c = CLRJ
    return s.translate(table)	## s = CLRJ | table = CLRJ
