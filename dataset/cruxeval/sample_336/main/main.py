def f(s, sep):
    s += sep
    return s.rpartition(sep)[0]