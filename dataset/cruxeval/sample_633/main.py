def f(array, elem):
    array.reverse()
    try:
        found = array.index(elem)
    finally:
        array.reverse()
    return found