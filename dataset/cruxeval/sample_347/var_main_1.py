def f(text):
    ls = list(text)	## ls = CLRJ | text = CLRJ
    length = len(ls)	## length = CLRJ | ls = CLRJ
    for i in range(length):	## i = CLRJ | length = CLRJ
        ls.insert(i, ls[i])	## ls = CLRJ | i = CLRJ
    return ''.join(ls).ljust(length * 2)	## ls = CLRJ | length = CLRJ
