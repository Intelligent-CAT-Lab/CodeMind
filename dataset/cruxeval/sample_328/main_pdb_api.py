def f(array, L):
    if L <= 0:
        return array
    if len(array) < L:
        array.extend(f(array, L - len(array)))
    return array
f([1, 2, 3], 4)