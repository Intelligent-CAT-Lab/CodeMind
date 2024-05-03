def f(a, b):
    for key, value in b.items():	## key = [] | value = [] | b = []
        if key not in a:	## key = [] | a = []
            a[key] = [value]	## a = [] | key = [] | value = []
        else:
            a[key].append(value)
    return a	## a = []
