def f(names, winners):
    ls = [names.index(name) for name in names if name in winners]
    ls.sort(reverse=True)
    return ls
f(['e', 'f', 'j', 'x', 'r', 'k'], ['a', 'v', '2', 'im', 'nb', 'vj', 'z'])