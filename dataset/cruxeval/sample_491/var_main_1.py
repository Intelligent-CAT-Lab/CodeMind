def f(xs):
    for i in range(-1, -len(xs)-1, -1):	## i = CLRJ | xs = CLRJ
        xs.extend([xs[i], xs[i]])	## xs = CLRJ | i = CLRJ
    return xs	## xs = CLRJ
