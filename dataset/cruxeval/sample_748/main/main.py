def f(d):
    i = iter(list(d.items()))
    return next(i), next(i)