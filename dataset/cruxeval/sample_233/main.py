def f(xs):
    for idx in reversed(range(-len(xs)-1, -1)):
        xs.insert(idx, xs.pop(0))
    return xs