def f(obj):
    for k, v in obj.items():
        if v >= 0:
            obj[k] = -v
    return obj