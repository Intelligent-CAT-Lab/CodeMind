def f(array):
    array_2 = []
    for i in array:
        if i>0:
            array_2 += [i]
    array_2.sort(reverse=True)
    return array_2