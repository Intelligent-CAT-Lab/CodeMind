def f(update, starting):
    d = starting.copy()	## <state>d = CLRJ | starting = CLRJ</state>
    for k in update:	## <state>update = CLRJ</state>
        if k in d:
            d[k] += update[k]
        else:
            d[k] = update[k]
    return d	## <state>d = CLRJ</state>
