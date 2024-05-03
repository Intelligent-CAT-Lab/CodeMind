def f(perc, full):
    reply = ""	## {"reply" : ''}
    i = 0	## {"i" : ''}
    while perc[i] == full[i] and i < len(full) and i < len(perc):	## {"perc" : '',"i" : '',"full" : ''}
        if perc[i] == full[i]:	## {"perc" : '',"i" : '',"full" : ''}
            reply += "yes "	## {"reply" : ''}
        else:
            reply += "no "
        i += 1	## {"i" : ''}
    return reply	## {"reply" : ''}
