def f(array, index):
    if index < 0:
        index = len(array) + index
    return array[index]