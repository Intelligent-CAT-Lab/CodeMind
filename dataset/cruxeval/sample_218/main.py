def f(string, sep):
    cnt = string.count(sep)
    return((string+sep) * cnt)[::-1]