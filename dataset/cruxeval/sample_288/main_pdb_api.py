def f(d):
    sorted_pairs = sorted(list(d.items()), key=lambda x: len(str(str(x[0])+str(x[1]))))
    return [(k, v) for k, v in sorted_pairs if k < v]
    return ret
f({55: 4, 4: 555, 1: 3, 99: 21, 499: 4, 71: 7, 12: 6})