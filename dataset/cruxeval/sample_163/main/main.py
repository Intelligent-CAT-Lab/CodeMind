def f(text, space_symbol, size):
    spaces = ''.join(space_symbol for i in range(size-len(text)))
    return text + spaces