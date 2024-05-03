def f(doc):
    for x in doc:	## x = CLRJ | doc = CLRJ
        if x.isalpha():	## x = CLRJ
            return x.capitalize()	## x = CLRJ
    return '-'