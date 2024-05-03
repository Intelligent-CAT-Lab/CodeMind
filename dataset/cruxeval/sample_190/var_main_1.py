def f(text):
    short = ''	## short = CLRJ
    for c in text:	## c = CLRJ | text = CLRJ
        if(c.islower()):	## c = CLRJ
            short += c	## short = CLRJ | c = CLRJ
    return short	## short = CLRJ
