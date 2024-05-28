d = {'a':1, 'b': {'c': {'d': {}}}}
if isinstance(d, dict):
    print(1 + (max(map(dict_depth, d.values())) if d else 0))
else:
    print(0)