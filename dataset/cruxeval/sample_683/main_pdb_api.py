def f(dict1, dict2):
    result = dict1.copy()
    result.update([(__, dict2[__]) for __ in dict2])
    return result
f({'disface': 9, 'cam': 7}, {'mforce': 5})