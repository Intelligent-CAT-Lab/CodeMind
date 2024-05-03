def f(dict0):
    new = dict0.copy()	## new = CLRJ | dict0 = CLRJ
    for i in range(len(new)-1):	## i = CLRJ | new = CLRJ
        dict0[sorted(new)[i]] = i	## dict0 = CLRJ | new = CLRJ | i = CLRJ
    return dict0	## dict0 = CLRJ
