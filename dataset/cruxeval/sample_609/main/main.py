def f(array, elem):
    result = array.copy()
    while result:
        key, value = result.popitem()
        if elem == key or elem == value:
            result.update(array)
        del result[key]
    return result