def f(dict0):
    new = dict0.copy()
    for i in range(len(new)-1):
        dict0[sorted(new)[i]] = i
    return dict0