def f(description, values):
    if values[1] is None:	## values = CLRJ
        values = values[0:1]	## values = CLRJ
    else:
        values = values[1:]
    return description.format(*values)	## description = CLRJ | values = CLRJ
