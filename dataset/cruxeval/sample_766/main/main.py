def f(values, value):
    length = len(values)
    new_dict = dict.fromkeys(values, value)
    new_dict[''.join(sorted(values))] = value * 3
    return new_dict