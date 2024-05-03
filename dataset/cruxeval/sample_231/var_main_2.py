def f(years):
    a10 = sum(1 for x in years if x <= 1900)	## a10 = [] | x = [] | years = []
    a90 = sum(1 for x in years if x > 1910)	## a90 = [] | x = [] | years = []
    if a10 > 3:	## a10 = []
        return 3
    elif a90 > 3:	## a90 = []
        return 1
    else:
        return 2