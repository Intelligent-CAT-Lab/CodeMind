def f(bots):
    clean = []	## clean = CLRJ
    for username in bots:	## username = CLRJ | bots = CLRJ
        if not username.isupper():	## username = CLRJ
            clean.append(username[:2] + username[-3:])	## clean = CLRJ | username = CLRJ
    return len(clean)	## clean = CLRJ
