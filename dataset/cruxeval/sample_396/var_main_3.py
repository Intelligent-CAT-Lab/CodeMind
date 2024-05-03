def f(ets):
    while ets:	## <state>ets = CLRJ</state>
        k, v = ets.popitem()
        ets[k] = v**2
    return ets	## <state>ets = CLRJ</state>
