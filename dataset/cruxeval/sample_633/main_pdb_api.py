def f(array, elem):
    array.reverse()
    try:
        found = array.index(elem)
    finally:
        array.reverse()
    return found
f([5, -3, 3, 2], 2)