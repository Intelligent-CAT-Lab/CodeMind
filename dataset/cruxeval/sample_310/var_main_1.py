def f(strands):
    subs = strands	## subs = CLRJ | strands = CLRJ
    for i, j in enumerate(subs):	## i = CLRJ | j = CLRJ | subs = CLRJ
        for _ in range(len(j) // 2):	## _ = CLRJ | j = CLRJ
            subs[i] = subs[i][-1:] + subs[i][1:-1] + subs[i][0]	## subs = CLRJ | i = CLRJ
    return ''.join(subs)	## subs = CLRJ
