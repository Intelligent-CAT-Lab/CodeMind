def f(s, c):
    s = s.split(' ')	## s = CLRJ
    return ((c + "  ") + ("  ".join(s[::-1])))	## c = CLRJ | s = CLRJ
