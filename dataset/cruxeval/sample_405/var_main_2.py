def f(xs):
    new_x = xs[0] - 1	## new_x = [] | xs = []
    xs.pop(0)	## xs = []
    while(new_x <= xs[0]):	## new_x = [] | xs = []
        xs.pop(0)
        new_x -= 1
    xs.insert(0, new_x)	## xs = [] | new_x = []
    return xs	## xs = []
