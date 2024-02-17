def f(n):
    n = str(n)
    return n[0] + '.'+n[1:].replace('-', '_')