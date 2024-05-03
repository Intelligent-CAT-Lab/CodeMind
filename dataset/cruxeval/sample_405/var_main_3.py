def f(xs):
    new_x = xs[0] - 1	## <state>new_x = CLRJ | xs = CLRJ</state>
    xs.pop(0)	## <state>xs = CLRJ</state>
    while(new_x <= xs[0]):	## <state>new_x = CLRJ | xs = CLRJ</state>
        xs.pop(0)
        new_x -= 1
    xs.insert(0, new_x)	## <state>xs = CLRJ | new_x = CLRJ</state>
    return xs	## <state>xs = CLRJ</state>
