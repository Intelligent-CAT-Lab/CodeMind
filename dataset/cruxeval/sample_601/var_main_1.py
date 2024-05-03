def f(text):
    t = 5	## t = CLRJ
    tab = []	## tab = CLRJ
    for i in text:	## i = CLRJ | text = CLRJ
        if i.lower() in 'aeiouy':	## i = CLRJ
            tab.append(i.upper() * t)	## tab = CLRJ | i = CLRJ | t = CLRJ
        else:
            tab.append(i * t)	## tab = CLRJ | i = CLRJ | t = CLRJ
    return ' '.join(tab)	## tab = CLRJ
