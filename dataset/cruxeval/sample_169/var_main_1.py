def f(text):
    ls = list(text)	## ls = CLRJ | text = CLRJ
    total = (len(text) - 1) * 2	## total = CLRJ | text = CLRJ
    for i in range(1, total+1):	## i = CLRJ | total = CLRJ
        if i % 2:	## i = CLRJ
            ls.append('+')	## ls = CLRJ
        else:
            ls.insert(0, '+')	## ls = CLRJ
    return ''.join(ls).rjust(total)	## ls = CLRJ | total = CLRJ
