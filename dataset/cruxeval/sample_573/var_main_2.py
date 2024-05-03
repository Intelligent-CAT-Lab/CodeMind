def f(string, prefix):
    if string.startswith(prefix):	## string = [] | prefix = []
        return string.removeprefix(prefix)
    return string	## string = []
