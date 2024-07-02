def f(s, c):
    s = s.split(' ')
    return ((c + "  ") + ("  ".join(s[::-1])))
f('Hello There', '*')