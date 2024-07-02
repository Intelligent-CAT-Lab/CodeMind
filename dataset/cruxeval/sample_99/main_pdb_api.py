def f(text, sep, num):
    return '___'.join(text.rsplit(sep, num))
f('aa+++bb', '+', 1)