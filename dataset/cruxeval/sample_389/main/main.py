def f(total, arg):
    if type(arg) is list:
        for e in arg:
            total.extend(e)
    else:
        total.extend(arg)
    return total