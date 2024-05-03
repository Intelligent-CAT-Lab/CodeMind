def f(a_str, prefix):
    if a_str.removeprefix(prefix):	## a_str = CLRJ | prefix = CLRJ
        return a_str
    else:
        return prefix + a_str