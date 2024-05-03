def f(text, sub):
    index = []	## <state>index = CLRJ</state>
    starting = 0	## <state>starting = CLRJ</state>
    while starting != -1:	## <state>starting = CLRJ</state>
        starting = text.find(sub, starting)	## <state>starting = CLRJ | text = CLRJ | sub = CLRJ</state>
        if starting != -1:	## <state>starting = CLRJ</state>
            index.append(starting)
            starting += len(sub)
    return index	## <state>index = CLRJ</state>
