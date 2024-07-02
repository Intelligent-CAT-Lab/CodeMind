def f(arr1, arr2):
    new_arr = arr1.copy()
    new_arr.extend(arr2)
    return new_arr
f([5, 1, 3, 7, 8], ['', 0, -1, []])