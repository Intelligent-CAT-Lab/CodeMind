def f(array, elem):
    for idx, e in enumerate(array):
        if e > elem and array[idx - 1] < elem:
            array.insert(idx, elem)
    return array