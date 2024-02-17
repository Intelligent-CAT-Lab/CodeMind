def f(array):
    result = []
    index = 0
    while index < len(array):
        result.append(array.pop())
        index += 2
    return result