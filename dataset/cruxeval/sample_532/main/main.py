def f(n, array):
    final = [array.copy()] 
    for i in range(n):
        arr = array.copy()
        arr.extend(final[-1])
        final.append(arr)
    return final