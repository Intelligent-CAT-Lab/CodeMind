def f(d):
    keys = []
    for k in d:
        keys.append('%s => %s' % (k, d[k]))
    return keys
f({'-4':'4','1':'2','-':'-3'})