def f(array):
    if len(array) == 1:
        return ''.join(array)
    result = list(array)
    i = 0
    while i < len(array)-1:
        for j in range(2):
            result[i*2] = array[i]
            i += 1
    return ''.join(result)