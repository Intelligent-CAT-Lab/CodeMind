def f(x, y):
    tmp = ''.join(['0' if c == '9' else '9' for c in y[::-1]])	## tmp = [] | c = [] | y = []
    if (x.isnumeric() and tmp.isnumeric()):	## x = [] | tmp = []
        return x + tmp
    else:
        return x	## x = []
