def f(text):
    ls = list(text)	## ls = CLRJ | text = CLRJ
    for i in range(0, len(ls)):	## i = CLRJ | ls = CLRJ
        if ls[i]!='+':	## ls = CLRJ | i = CLRJ
            ls.insert(i, '+')	## ls = CLRJ | i = CLRJ
            ls.insert(i, '*')	## ls = CLRJ | i = CLRJ
            break
    return '+'.join(ls)	## ls = CLRJ
