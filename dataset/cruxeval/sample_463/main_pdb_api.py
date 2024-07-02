def f(dict):
    result = dict.copy()
    remove_keys = []
    for k, v in dict.items():
        if v in dict:
            del result[k]
    return result
f({-1: -1, 5: 5, 3: 6, -4: -4})