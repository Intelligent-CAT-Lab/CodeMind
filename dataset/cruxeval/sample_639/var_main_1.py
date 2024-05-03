def f(perc, full):
    reply = ""	## reply = CLRJ
    i = 0	## i = CLRJ
    while perc[i] == full[i] and i < len(full) and i < len(perc):	## perc = CLRJ | i = CLRJ | full = CLRJ
        if perc[i] == full[i]:	## perc = CLRJ | i = CLRJ | full = CLRJ
            reply += "yes "	## reply = CLRJ
        else:
            reply += "no "
        i += 1	## i = CLRJ
    return reply	## reply = CLRJ
