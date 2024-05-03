def f(perc, full):
    reply = ""	## <state>reply = CLRJ</state>
    i = 0	## <state>i = CLRJ</state>
    while perc[i] == full[i] and i < len(full) and i < len(perc):	## <state>perc = CLRJ | i = CLRJ | full = CLRJ</state>
        if perc[i] == full[i]:	## <state>perc = CLRJ | i = CLRJ | full = CLRJ</state>
            reply += "yes "	## <state>reply = CLRJ</state>
        else:
            reply += "no "
        i += 1	## <state>i = CLRJ</state>
    return reply	## <state>reply = CLRJ</state>
