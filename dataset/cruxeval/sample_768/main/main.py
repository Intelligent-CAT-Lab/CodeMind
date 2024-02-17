def f(s, o):
    if s.startswith(o):
        return s
    return o + f(s, o[-2::-1])