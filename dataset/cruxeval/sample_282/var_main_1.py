def f(s1, s2):
    position = 1	## position = CLRJ
    count = 0	## count = CLRJ
    while position > 0:	## position = CLRJ
        position = s1.find(s2, position)	## position = CLRJ | s1 = CLRJ | s2 = CLRJ
        count += 1	## count = CLRJ
        position += 1	## position = CLRJ
    return count	## count = CLRJ
