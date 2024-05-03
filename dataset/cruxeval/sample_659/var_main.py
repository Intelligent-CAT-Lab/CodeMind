def f(bots):
    clean = []	## {"clean" : ''}
    for username in bots:	## {"username" : '',"bots" : ''}
        if not username.isupper():	## {"username" : ''}
            clean.append(username[:2] + username[-3:])	## {"clean" : '',"username" : ''}
    return len(clean)	## {"clean" : ''}
