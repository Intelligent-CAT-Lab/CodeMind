def f(s, sep):
    reverse = ['*' + e for e in s.split(sep)]
    return ';'.join(reversed(reverse))