def f(arr):
    count = len(arr)
    sub = arr.copy()
    for i in range(0, count, 2):
        sub[i] *= 5
    return sub