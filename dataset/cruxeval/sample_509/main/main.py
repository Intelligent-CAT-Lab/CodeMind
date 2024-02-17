def f(value, width):
    if value >= 0:
        return str(value).zfill(width)

    if value < 0:
        return '-' + str(-value).zfill(width)
    return ''