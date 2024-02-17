def f(my_dict):
    result = {v: k for k, v in list(my_dict.items())}
    return result