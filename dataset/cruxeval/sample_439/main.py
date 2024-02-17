def f(value):
    parts = value.partition(' ')[::2]
    return ''.join(parts)