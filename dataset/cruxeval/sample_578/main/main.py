def f(obj):
    for k, v in list(obj.items()):
        if v >= 0:
            obj[k] = -v
    return obj