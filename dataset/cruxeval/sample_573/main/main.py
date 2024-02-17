def f(string, prefix):
    if string.startswith(prefix):
        return string.removeprefix(prefix)
    return string