def f(array):
    a = []
    array.reverse()
    for i in range(len(array)):
        if array[i] != 0:
            a.append(array[i])
    a.reverse()
    return a