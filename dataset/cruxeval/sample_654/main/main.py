def f(s, from_c, to_c):
    table = s.maketrans(from_c, to_c)
    return s.translate(table)