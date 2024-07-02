def f(d, rm):
    res = d.copy()
    for k in rm:
        if k in res:
            del res[k]
    return res
f({'1': 'a', 1: 'a', 1: 'b', '1': 'b'}, [1])