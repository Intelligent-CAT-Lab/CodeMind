def f(years):
    a10 = sum(1 for x in years if x <= 1900)
    a90 = sum(1 for x in years if x > 1910)
    if a10 > 3:
        return 3
    elif a90 > 3:
        return 1
    else:
        return 2