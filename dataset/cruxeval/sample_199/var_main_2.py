def f(str, char):
    base = char * (str.count(char) + 1)	## base = [] | char = [] | str = []
    return str.removesuffix(base)	## str = [] | base = []
