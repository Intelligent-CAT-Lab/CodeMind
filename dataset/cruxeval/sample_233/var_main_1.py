def f(xs):
    for idx in reversed(range(-len(xs)-1, -1)):	## idx = CLRJ | xs = CLRJ
        xs.insert(idx, xs.pop(0))	## xs = CLRJ | idx = CLRJ
    return xs	## xs = CLRJ
