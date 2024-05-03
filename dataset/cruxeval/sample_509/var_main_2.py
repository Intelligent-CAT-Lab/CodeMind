def f(value, width):
    if value >= 0:	## value = []
        return str(value).zfill(width)	## value = [] | width = []

    if value < 0:
        return '-' + str(-value).zfill(width)
    return ''