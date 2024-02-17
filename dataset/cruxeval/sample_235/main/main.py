def f(array, arr):
    result = []
    for s in arr:
        result += list([l for l in s.split(arr[array.index(s)]) if l != ''])
    return result