def f(x, y):
    tmp = ''.join(['0' if c == '9' else '9' for c in y[::-1]])	## <state>tmp = CLRJ | c = CLRJ | y = CLRJ</state>
    if (x.isnumeric() and tmp.isnumeric()):	## <state>x = CLRJ | tmp = CLRJ</state>
        return x + tmp
    else:
        return x	## <state>x = CLRJ</state>
