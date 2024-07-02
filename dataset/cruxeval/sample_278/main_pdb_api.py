def f(array1, array2):
    result = dict.fromkeys(array1)
    for key in result:
        result[key] = [el for el in array2 if key * 2 > el]
    return result
f([0, 132], [5, 991, 32, 997])