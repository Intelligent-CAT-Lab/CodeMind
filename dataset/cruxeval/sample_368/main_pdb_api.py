def f(string, numbers):
    arr = []
    for num in numbers:
        arr.append(string.zfill(num))
    return ' '.join(arr)
f('4327', [2, 8, 9, 2, 7, 1])