def f(lst, mode):
    result = [el for el in lst]
    if mode:
        result.reverse()
    return result