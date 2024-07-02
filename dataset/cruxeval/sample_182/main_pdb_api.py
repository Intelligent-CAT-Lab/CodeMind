def f(dic):
    return sorted(dic.items(), key=lambda x: x[0])
f({'b': 1, 'a': 2})