def f(s):
    b = ''	## b = CLRJ
    c = ''	## c = CLRJ
    for i in s:	## i = CLRJ | s = CLRJ
        c = c + i	## c = CLRJ | i = CLRJ
        if s.rfind(c) > -1:	## s = CLRJ | c = CLRJ
            return s.rfind(c)	## s = CLRJ | c = CLRJ
    return 0