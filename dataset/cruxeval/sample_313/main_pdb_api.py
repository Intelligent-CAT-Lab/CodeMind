def f(s, l):
    return s.ljust(l, '=').rpartition('=')[0]
f('urecord', 8)