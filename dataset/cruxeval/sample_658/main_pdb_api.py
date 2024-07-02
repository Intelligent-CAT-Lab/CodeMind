def f(d, get_ary):
    result = []
    for key in get_ary:
        result.append(d.get(key))
    return result
f({3: "swims like a bull"}, [3, 2, 'c', True, 5])