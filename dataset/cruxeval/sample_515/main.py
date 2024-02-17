def f(array):
    result = array.copy()
    result.reverse()
    result[:] = [item * 2 for item in result]
    return result