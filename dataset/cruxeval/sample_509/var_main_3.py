def f(value, width):
    if value >= 0:	## <state>value = CLRJ</state>
        return str(value).zfill(width)	## <state>value = CLRJ | width = CLRJ</state>

    if value < 0:
        return '-' + str(-value).zfill(width)
    return ''