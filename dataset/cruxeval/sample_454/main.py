def f(d, count):
    new_dict = {}
    for _ in range(count):
        d = d.copy()
        new_dict = {**d, **new_dict}
    return new_dict