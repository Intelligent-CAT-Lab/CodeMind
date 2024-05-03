def f(str, char):
    base = char * (str.count(char) + 1)	## base = CLRJ | char = CLRJ | str = CLRJ
    return str.removesuffix(base)	## str = CLRJ | base = CLRJ
