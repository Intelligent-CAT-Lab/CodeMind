def f(s):
    b = ''
    c = ''
    for i in s:
        c = c + i
        if s.rfind(c) > -1:
            return s.rfind(c)
    return 0