def f(total, arg):
    if type(arg) is list:	## arg = []
        for e in arg:
            total.extend(e)
    else:
        total.extend(arg)	## total = [] | arg = []
    return total	## total = []
