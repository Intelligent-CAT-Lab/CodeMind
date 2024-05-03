def f(x, y):
    tmp = ''.join(['0' if c == '9' else '9' for c in y[::-1]])	## tmp = CLRJ | c = CLRJ | y = CLRJ
    if (x.isnumeric() and tmp.isnumeric()):	## x = CLRJ | tmp = CLRJ
        return x + tmp
    else:
        return x	## x = CLRJ
