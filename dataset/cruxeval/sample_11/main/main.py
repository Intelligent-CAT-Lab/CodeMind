def f(a, b):
    for key, value in list(b.items()):
        if key not in a:
            a[key] = [value]
        else:
            a[key].append(value)
    return a