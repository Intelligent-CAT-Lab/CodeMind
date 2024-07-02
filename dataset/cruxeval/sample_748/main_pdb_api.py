def f(d):
    i = iter(d.items())
    return next(i), next(i)
f({'a': 123, 'b': 456, 'c': 789})