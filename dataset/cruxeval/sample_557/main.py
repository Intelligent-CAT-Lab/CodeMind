def f(str):
    d = str.rpartition('ar')
    return ' '.join((d[0], d[1], d[2]))