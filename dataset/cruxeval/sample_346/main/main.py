def f(filename):
    suffix = filename.split('.')[-1]
    f2 = filename + suffix[::-1]
    return f2.endswith(suffix)