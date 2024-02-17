def f(multi_string):
    cond_string = map(str.isascii, multi_string.split())
    if True in cond_string:
        return ', '.join(x for x in multi_string.split() if x.isascii())
    return ''