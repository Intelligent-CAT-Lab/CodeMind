def f(text, value):
    ls = list(text)	## ls = CLRJ | text = CLRJ
    if (ls.count(value)) % 2 == 0:	## ls = CLRJ | value = CLRJ
        while value in ls:	## value = CLRJ | ls = CLRJ
            ls.remove(value)
    else:
        ls.clear()
    return ''.join(ls)	## ls = CLRJ
