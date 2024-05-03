def f(d):
    dCopy = d.copy()	## dCopy = [] | d = []
    for key, value in dCopy.items():	## key = [] | value = [] | dCopy = []
        for i in range(len(value)):	## i = [] | value = []
            value[i] = value[i].upper()	## value = [] | i = []
    return dCopy	## dCopy = []
