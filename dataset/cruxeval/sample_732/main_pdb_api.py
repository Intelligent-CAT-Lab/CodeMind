def f(char_freq):
    result = {}
    for k, v in char_freq.copy().items():
        result[k] = v // 2
    return result
f({'u': 20, 'v': 5, 'b': 7, 'w': 3, 'x': 3})