def f(arr):
    result = []
    for item in arr:
        try:
            if item.isnumeric():
                result.append(int(item)*2)
        except ValueError:
            result.append(item[::-1])
    return result