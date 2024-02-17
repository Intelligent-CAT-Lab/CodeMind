def f(array):
    for i in range(len(array)):
        if array[i] < 0:
            array.pop(i)
    return array