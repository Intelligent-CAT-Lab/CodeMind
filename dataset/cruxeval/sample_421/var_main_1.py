def f(str, n):
    if len(str) < n:	## str = CLRJ | n = CLRJ
        return str	## str = CLRJ
    else:
        return str.removeprefix(str[:n])