def f(s):
    left, sep, right = s.rpartition('.')
    new = sep.join([right, left])
    _, sep, _ = new.rpartition('.')
    return new.replace(sep, ', ')