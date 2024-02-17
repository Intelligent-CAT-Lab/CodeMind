def f(char_freq):
    result = {}
    for k, v in list(char_freq.copy().items()):
        result[k] = v // 2
    return result