def f(s, n, c):
    width = len(c)*n	## width = CLRJ | c = CLRJ | n = CLRJ
    for _ in range(width - len(s)):	## width = CLRJ | s = CLRJ
        s = c + s
    return s	## s = CLRJ
