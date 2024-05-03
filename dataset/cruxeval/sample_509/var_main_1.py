def f(value, width):
    if value >= 0:	## value = CLRJ
        return str(value).zfill(width)	## value = CLRJ | width = CLRJ

    if value < 0:
        return '-' + str(-value).zfill(width)
    return ''