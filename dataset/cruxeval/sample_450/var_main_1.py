def f(strs):
    strs = strs.split()	## strs = CLRJ
    for i in range(1, len(strs), 2):	## i = CLRJ | strs = CLRJ
        strs[i] = ''.join(reversed(strs[i]))	## strs = CLRJ | i = CLRJ
    return ' '.join(strs)	## strs = CLRJ
