def f(items, target):
    if target in items:	## <state>target = CLRJ | items = CLRJ</state>
        return items.index(target)	## <state>items = CLRJ | target = CLRJ</state>
    return -1