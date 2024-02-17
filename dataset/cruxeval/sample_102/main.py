def f(names, winners):
    ls = [names.index(name) for name in names if name in winners]
    ls.sort(reverse=True)
    return ls