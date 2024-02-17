def f(a):
    a = a.replace('/', ':')
    z = a.rpartition(':')
    return [z[0], z[1], z[2]]