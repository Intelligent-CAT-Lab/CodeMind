def f(array):
    result = []
    for elem in array:
        if elem.isascii() or (isinstance(elem, int) and not str(abs(elem)).isascii()):
            result.append(elem)
    return result