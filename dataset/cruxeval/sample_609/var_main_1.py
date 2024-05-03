def f(array, elem):
    result = array.copy()	## result = CLRJ | array = CLRJ
    while result:	## result = CLRJ
        key, value = result.popitem()
        if elem == key or elem == value:
            result.update(array)
        del result[key]
    return result	## result = CLRJ
