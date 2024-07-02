def f(s, sep):
    s += sep
    return s.rpartition(sep)[0]
f('234dsfssdfs333324314', 's')