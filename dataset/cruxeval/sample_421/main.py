def f(str, n):
    if len(str) < n:
        return str
    else:
        return str.removeprefix(str[:n])