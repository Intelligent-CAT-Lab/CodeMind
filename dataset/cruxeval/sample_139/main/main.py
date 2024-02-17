def f(first, second):
    if len(first) < 10 or len(second) < 10:
        return 'no'
    for i in range(5):
        if first[i] != second[i]:
            return 'no'
    first.extend(second)
    return first