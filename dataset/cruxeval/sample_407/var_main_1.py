def f(s):
    while len(s) > 1:	## s = CLRJ
        s.clear()	## s = CLRJ
        s.append(len(s))	## s = CLRJ
    return s.pop()	## s = CLRJ
