def dict_depth(d):
    if isinstance(d, dict):
        return 1 + (max(map(dict_depth, d.values())) if d else 0)
    return 0
dict_depth({'a':1, 'b': {'c': {'d': {}}}})