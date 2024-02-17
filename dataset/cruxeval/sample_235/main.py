def f(array, arr):
    result = []
    for s in arr:
        result += list(filter(lambda l: l != '', s.split(arr[array.index(s)])))
    return result