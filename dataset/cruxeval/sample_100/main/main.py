def f(d, rm):
    res = d.copy()
    for k in rm:
        if k in res:
            del res[k]
    return res