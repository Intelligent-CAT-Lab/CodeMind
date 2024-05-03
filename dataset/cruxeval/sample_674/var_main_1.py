def f(text):
    ls = list(text)	## ls = CLRJ | text = CLRJ
    for x in range(len(ls)-1, -1, -1):	## x = CLRJ | ls = CLRJ
        if len(ls) <= 1: break	## ls = CLRJ
        if ls[x] not in 'zyxwvutsrqponmlkjihgfedcba': ls.pop(ls[x])	## ls = CLRJ | x = CLRJ
    return ''.join(ls)	## ls = CLRJ
