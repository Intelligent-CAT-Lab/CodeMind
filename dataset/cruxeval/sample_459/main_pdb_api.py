def f(arr, d):
    for i in range(1, len(arr), 2):
        d.update({arr[i]: arr[i-1]})

    return d
f(['b', 'vzjmc', 'f', 'ae', '0'], dict())