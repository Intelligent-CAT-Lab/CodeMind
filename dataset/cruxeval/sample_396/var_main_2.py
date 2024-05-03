def f(ets):
    while ets:	## ets = []
        k, v = ets.popitem()
        ets[k] = v**2
    return ets	## ets = []
