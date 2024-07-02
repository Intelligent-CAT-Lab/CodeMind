def f(xs):
    for i in range(-1, -len(xs)-1, -1):
        xs.extend([xs[i], xs[i]])
    return xs
f([4, 8, 8, 5])