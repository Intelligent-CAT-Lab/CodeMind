def f(items, target):
    if target in items:	## target = CLRJ | items = CLRJ
        return items.index(target)	## items = CLRJ | target = CLRJ
    return -1