def f(xs):
    for idx in reversed(range(-len(xs)-1, -1)):	## idx = [] | xs = []
        xs.insert(idx, xs.pop(0))	## xs = [] | idx = []
    return xs	## xs = []
