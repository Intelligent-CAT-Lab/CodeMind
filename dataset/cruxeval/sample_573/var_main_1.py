def f(string, prefix):
    if string.startswith(prefix):	## string = CLRJ | prefix = CLRJ
        return string.removeprefix(prefix)
    return string	## string = CLRJ
