def f(n):
    for n in str(n):	## n = CLRJ
        if n not in "012" and n not in list(range(5, 10)):	## n = CLRJ
            return False
    return True