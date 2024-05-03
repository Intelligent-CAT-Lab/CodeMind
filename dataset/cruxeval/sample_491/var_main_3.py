def f(xs):
    for i in range(-1, -len(xs)-1, -1):	## <state>i = CLRJ | xs = CLRJ</state>
        xs.extend([xs[i], xs[i]])	## <state>xs = CLRJ | i = CLRJ</state>
    return xs	## <state>xs = CLRJ</state>
