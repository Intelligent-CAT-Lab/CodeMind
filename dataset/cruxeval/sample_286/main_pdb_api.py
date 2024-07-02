def f(array, x, i):
    if i < -len(array) or i > len(array) - 1:
        return 'no'
    temp = array[i]
    array[i] = x
    return array
f([1,2,3,4,5,6,7,8,9,10], 11, 4)