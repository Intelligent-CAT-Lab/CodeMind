def f(total, arg):
    if type(arg) is list:	## arg = CLRJ
        for e in arg:
            total.extend(e)
    else:
        total.extend(arg)	## total = CLRJ | arg = CLRJ
    return total	## total = CLRJ
