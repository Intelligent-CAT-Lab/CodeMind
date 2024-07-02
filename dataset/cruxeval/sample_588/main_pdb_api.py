def f(items, target):
    if target in items:
        return items.index(target)
    return -1
f(['''1''', '+', '-', '**', '//', '*', '+'], '**')