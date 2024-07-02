def f(array, elem):
    for idx, e in enumerate(array):
        if e > elem and array[idx - 1] < elem:
            array.insert(idx, elem)
    return array
f([1, 2, 3, 5, 8], 6)