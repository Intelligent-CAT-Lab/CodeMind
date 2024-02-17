def f(array, L):
    if L <= 0:
        return array
    if len(array) < L:
        array.extend(f(array, L - len(array)))
    return array