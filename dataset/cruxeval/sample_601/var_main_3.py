def f(text):
    t = 5	## <state>t = CLRJ</state>
    tab = []	## <state>tab = CLRJ</state>
    for i in text:	## <state>i = CLRJ | text = CLRJ</state>
        if i.lower() in 'aeiouy':	## <state>i = CLRJ</state>
            tab.append(i.upper() * t)	## <state>tab = CLRJ | i = CLRJ | t = CLRJ</state>
        else:
            tab.append(i * t)	## <state>tab = CLRJ | i = CLRJ | t = CLRJ</state>
    return ' '.join(tab)	## <state>tab = CLRJ</state>
