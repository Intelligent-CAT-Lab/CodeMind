def f(text):
    t = list(text)	## <state>t = CLRJ | text = CLRJ</state>
    t.pop(len(t) // 2)	## <state>t = CLRJ</state>
    t.append(text.lower())	## <state>t = CLRJ | text = CLRJ</state>
    return ':'.join([c for c in t])	## <state>c = CLRJ | t = CLRJ</state>
