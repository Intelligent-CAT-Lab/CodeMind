def f(array, elem):
    result = array.copy()	## <state>result = CLRJ | array = CLRJ</state>
    while result:	## <state>result = CLRJ</state>
        key, value = result.popitem()
        if elem == key or elem == value:
            result.update(array)
        del result[key]
    return result	## <state>result = CLRJ</state>
