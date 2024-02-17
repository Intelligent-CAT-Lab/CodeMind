def f(array):
    d = dict(array)
    for key, value in d.items():
        if value < 0 or value > 9:
            return None
    return d