def f(a_str, prefix):
    if a_str.removeprefix(prefix):
        return a_str
    else:
        return prefix + a_str