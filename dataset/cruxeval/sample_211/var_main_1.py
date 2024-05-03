def f(s):
    count = 0	## count = CLRJ
    for c in s:	## c = CLRJ | s = CLRJ
        if s.rindex(c) != s.index(c):	## s = CLRJ | c = CLRJ
            count+=1	## count = CLRJ
    return count	## count = CLRJ
