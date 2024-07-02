def f(obj):
    for k, v in obj.items():
        if v >= 0:
            obj[k] = -v
    return obj
f({'R': 0, 'T': 3, 'F': -6, 'K': 0})