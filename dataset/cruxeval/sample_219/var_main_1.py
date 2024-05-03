def f(s1, s2):
    for k in range(0, len(s2)+len(s1)):	## k = CLRJ | s2 = CLRJ | s1 = CLRJ
        s1 += s1[0]	## s1 = CLRJ
        if s1.find(s2) >= 0:	## s1 = CLRJ | s2 = CLRJ
            return True
    return False