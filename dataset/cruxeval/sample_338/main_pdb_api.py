def f(my_dict):
    result = {v: k for k, v in my_dict.items()}
    return result
f({'a': 1, 'b': 2, 'c': 3, 'd': 2})