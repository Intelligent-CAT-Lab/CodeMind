def f(d):
    keys = []
    for k in d:
        keys.append('%s => %s' % (k, d[k]))
    return keys