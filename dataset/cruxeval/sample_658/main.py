def f(d, get_ary):
    result = []
    for key in get_ary:
        result.append(d.get(key))
    return result