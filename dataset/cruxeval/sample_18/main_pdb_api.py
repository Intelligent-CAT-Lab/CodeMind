def f(array, elem):
    k = 0
    l = array.copy()
    for i in l:
        if i > elem:
            array.insert(k, elem)
            break
        k += 1
    return array
f([5, 4, 3, 2, 1, 0], 3)