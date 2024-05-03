def f(s, l):
    return s.ljust(l, '=').rpartition('=')[0]	## s = [] | l = []
