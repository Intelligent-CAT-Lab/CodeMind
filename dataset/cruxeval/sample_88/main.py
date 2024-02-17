def f(s1, s2):
    if s2.endswith(s1):
        s2 = s2[:len(s1) * -1]
    return s2