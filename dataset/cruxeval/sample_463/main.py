def f(dict):
    result = dict.copy()
    remove_keys = []
    for k, v in dict.items():
        if v in dict:
            del result[k]
    return result