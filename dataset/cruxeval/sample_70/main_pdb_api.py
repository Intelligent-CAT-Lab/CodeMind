def f(x):
    a = 0
    for i in x.split(' '):
        a += len(i.zfill(len(i)*2))
    return a
f('999893767522480')