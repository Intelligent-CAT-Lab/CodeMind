def f(text):
    a = text.strip().split(' ')	## a = CLRJ | text = CLRJ
    for i in range(len(a)):	## i = CLRJ | a = CLRJ
        if a[i].isdigit() is False:	## a = CLRJ | i = CLRJ
            return '-'
    return " ".join(a)