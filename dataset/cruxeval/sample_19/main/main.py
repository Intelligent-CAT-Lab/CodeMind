def f(x, y):
    tmp = ''.join(['0' if c == '9' else '9' for c in y[::-1]])
    if (x.isnumeric() and tmp.isnumeric()):
        return x + tmp
    else:
        return x