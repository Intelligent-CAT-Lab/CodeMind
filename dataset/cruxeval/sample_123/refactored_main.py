array = [1, 2, 3, 5, 8]
elem = 6
for idx, e in enumerate(array):
    if e > elem and array[idx - 1] < elem:
        array.insert(idx, elem)
print(array)