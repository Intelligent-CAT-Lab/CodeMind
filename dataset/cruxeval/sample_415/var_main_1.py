def f(array):
    d = dict(array)	## d = CLRJ | array = CLRJ
    for key, value in d.items():	## key = CLRJ | value = CLRJ | d = CLRJ
        if value < 0 or value > 9:	## value = CLRJ
            return None
    return d	## d = CLRJ
