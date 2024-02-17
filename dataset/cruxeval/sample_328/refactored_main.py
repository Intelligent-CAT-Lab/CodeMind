array = [1, 2, 3]
L = 4
if L <= 0:
    print(array)
if len(array) < L:
    array.extend(f(array, L - len(array)))
print(array)