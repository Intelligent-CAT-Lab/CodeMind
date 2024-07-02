def f(s):
    while len(s) > 1:
        s.clear()
        s.append(len(s))
    return s.pop()
f([6, 1, 2, 3])