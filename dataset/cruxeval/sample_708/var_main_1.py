def f(string):
    l = list(string)	## l = CLRJ | string = CLRJ
    for i in reversed(range(len(l))):	## i = CLRJ | l = CLRJ
        if l[i] != ' ':	## l = CLRJ | i = CLRJ
            break
        l.pop(i)	## l = CLRJ | i = CLRJ
    return ''.join(l)	## l = CLRJ
