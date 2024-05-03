def f(description, values):
    if values[1] is None:	## {"values" : ''}
        values = values[0:1]	## {"values" : ''}
    else:
        values = values[1:]
    return description.format(*values)	## {"description" : '',"values" : ''}
