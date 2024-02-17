def f(array, elem):
    k = 0
    l = array.copy()
    for i in l:
        if i > elem:
            array.insert(k, elem)
            break
        k += 1
    return array