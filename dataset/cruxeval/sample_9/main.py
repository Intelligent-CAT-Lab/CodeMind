def f(t):
    for c in t:
        if not c.isnumeric():
            return False
    return True