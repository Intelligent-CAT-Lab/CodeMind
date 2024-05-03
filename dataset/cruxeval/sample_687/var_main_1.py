def f(text):
    t = list(text)	## t = CLRJ | text = CLRJ
    t.pop(len(t) // 2)	## t = CLRJ
    t.append(text.lower())	## t = CLRJ | text = CLRJ
    return ':'.join([c for c in t])	## c = CLRJ | t = CLRJ
