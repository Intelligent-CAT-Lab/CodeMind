def f(array):
    output = array.copy()
    output[0::2] = output[-1::-2]
    output.reverse()
    return output