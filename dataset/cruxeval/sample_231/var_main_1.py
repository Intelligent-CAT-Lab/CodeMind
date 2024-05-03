def f(years):
    a10 = sum(1 for x in years if x <= 1900)	## a10 = CLRJ | x = CLRJ | years = CLRJ
    a90 = sum(1 for x in years if x > 1910)	## a90 = CLRJ | x = CLRJ | years = CLRJ
    if a10 > 3:	## a10 = CLRJ
        return 3
    elif a90 > 3:	## a90 = CLRJ
        return 1
    else:
        return 2