def f(t):
    a, sep, b = t.rpartition('-')
    if len(b) == len(a):
        return 'imbalanced'
    return a + b.replace(sep, '')