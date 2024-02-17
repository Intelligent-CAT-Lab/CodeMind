def f(strings, substr):
    list = [s for s in strings if s.startswith(substr)]
    return sorted(list, key=len)