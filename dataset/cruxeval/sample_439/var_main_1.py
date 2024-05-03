def f(value):
    parts = value.partition(' ')[::2]	## parts = CLRJ | value = CLRJ
    return ''.join(parts)	## parts = CLRJ
