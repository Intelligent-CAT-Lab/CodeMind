def f(array):
    result = array.copy()
    result.reverse()
    result[:] = [item * 2 for item in result]
    return result
f([1, 2, 3, 4, 5])