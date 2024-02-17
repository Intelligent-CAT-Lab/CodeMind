def f(description, values):
    if values[1] is None:
        values = values[0:1]
    else:
        values = values[1:]
    return description.format(*values)