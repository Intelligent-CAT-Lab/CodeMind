def f(years):
    a10 = sum(1 for x in years if x <= 1900)	## <state>a10 = CLRJ | x = CLRJ | years = CLRJ</state>
    a90 = sum(1 for x in years if x > 1910)	## <state>a90 = CLRJ | x = CLRJ | years = CLRJ</state>
    if a10 > 3:	## <state>a10 = CLRJ</state>
        return 3
    elif a90 > 3:	## <state>a90 = CLRJ</state>
        return 1
    else:
        return 2