def f(s, o):
    if s.startswith(o):	## s = CLRJ | o = CLRJ
        return s	## s = CLRJ
    return o + f(s, o[-2::-1])	## o = CLRJ | s = CLRJ
