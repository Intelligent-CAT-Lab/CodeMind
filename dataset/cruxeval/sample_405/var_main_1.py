def f(xs):
    new_x = xs[0] - 1	## new_x = CLRJ | xs = CLRJ
    xs.pop(0)	## xs = CLRJ
    while(new_x <= xs[0]):	## new_x = CLRJ | xs = CLRJ
        xs.pop(0)
        new_x -= 1
    xs.insert(0, new_x)	## xs = CLRJ | new_x = CLRJ
    return xs	## xs = CLRJ
