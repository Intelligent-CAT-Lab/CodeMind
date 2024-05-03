def f(xs):
    for idx in reversed(range(-len(xs)-1, -1)):	## <state>idx = CLRJ | xs = CLRJ</state>
        xs.insert(idx, xs.pop(0))	## <state>xs = CLRJ | idx = CLRJ</state>
    return xs	## <state>xs = CLRJ</state>
