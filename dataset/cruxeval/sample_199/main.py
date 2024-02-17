def f(str, char):
    base = char * (str.count(char) + 1)
    return str.removesuffix(base)