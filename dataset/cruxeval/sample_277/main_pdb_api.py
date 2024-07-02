def f(lst, mode):
    result = [el for el in lst]
    if mode:
        result.reverse()
    return result
f([1, 2, 3, 4], 1)