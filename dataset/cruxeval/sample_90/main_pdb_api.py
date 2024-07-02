def f(array):
    return_arr = []
    for a in array:
        return_arr.append(a.copy())
    return return_arr
f([[1, 2, 3], [], [1, 2, 3]])