def f(array):
    result = []
    index = 0
    while index < len(array):
        result.append(array.pop())
        index += 2
    return result
f([8, 8, -4, -9, 2, 8, -1, 8])