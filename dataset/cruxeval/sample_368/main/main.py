def f(string, numbers):
    arr = []
    for num in numbers:
        arr.append(string.zfill(num))
    return ' '.join(arr)