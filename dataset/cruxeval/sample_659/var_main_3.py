def f(bots):
    clean = []	## <state>clean = CLRJ</state>
    for username in bots:	## <state>username = CLRJ | bots = CLRJ</state>
        if not username.isupper():	## <state>username = CLRJ</state>
            clean.append(username[:2] + username[-3:])	## <state>clean = CLRJ | username = CLRJ</state>
    return len(clean)	## <state>clean = CLRJ</state>
