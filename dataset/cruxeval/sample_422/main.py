def f(array):
    new_array = array.copy()
    new_array = reversed(new_array)
    return [x*x for x in new_array]