def f(text):
    short = ''	## <state>short = CLRJ</state>
    for c in text:	## <state>c = CLRJ | text = CLRJ</state>
        if(c.islower()):	## <state>c = CLRJ</state>
            short += c	## <state>short = CLRJ | c = CLRJ</state>
    return short	## <state>short = CLRJ</state>
