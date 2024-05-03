def f(n):
    streak = ''	## streak = CLRJ
    for c in str(n):	## c = CLRJ | n = CLRJ
        streak += c.ljust(int(c) * 2)	## streak = CLRJ | c = CLRJ
    return streak	## streak = CLRJ
