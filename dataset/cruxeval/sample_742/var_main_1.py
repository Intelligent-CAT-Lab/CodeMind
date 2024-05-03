def f(text):
    b = True	## b = CLRJ
    for x in text:	## x = CLRJ | text = CLRJ
        if x.isdigit():	## x = CLRJ
            b = True
        else:
            b = False	## b = CLRJ
            break
    return b	## b = CLRJ
