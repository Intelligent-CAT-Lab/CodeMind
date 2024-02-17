def f(arr):
    arr = list(arr)
    arr.clear()
    arr.append('1')
    arr.append('2')
    arr.append('3')
    arr.append('4')
    return ','.join(arr)